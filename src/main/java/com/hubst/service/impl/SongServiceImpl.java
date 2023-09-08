package com.hubst.service.impl;

import com.hubst.entity.ResponseData;
import com.hubst.entity.Song;
import com.hubst.dao.SongDao;
import com.hubst.service.SongService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Song)表服务实现类
 *
 * @author makejava
 * @since 2023-08-01 21:59:32
 */
@Service("songService")
public class SongServiceImpl implements SongService {
    @Resource
    private SongDao songDao;

    /**
     * 通过ID查询单条数据
     *
     * @param songid 主键
     * @return 实例对象
     */
    @Override
    public Song queryById(Integer songid) {
        return this.songDao.queryById(songid);
    }

    /**
     * 分页查询
     *
     * @param song 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Song> queryByPage(Song song, PageRequest pageRequest) {
        long total = this.songDao.count(song);
        return new PageImpl<>(this.songDao.queryAllByLimit(song, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    @Override
    public Song insert(Song song) {
        this.songDao.insert(song);
        return song;
    }

    /**
     * 修改数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    @Override
    public Song update(Song song) {
        this.songDao.update(song);
        return this.queryById(song.getSongid());
    }

    /**
     * 通过主键删除数据
     *
     * @param songid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer songid) {
        return this.songDao.deleteById(songid) > 0;
    }

    @Override
    public ResponseData getIndexSongInfo() {
        try{
            List<Song> songs = songDao.getIndexSongInfo();
            return new ResponseData("0","请求成功",songs);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseData("9999","网络异常");
        }
    }

    @Override
    public ResponseData getAllSongInfo() {
        try {
            List<Song> songs = songDao.getAllSongInfo();
            return new ResponseData("0","请求成功",songs);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseData("9999","网络异常");
        }
    }

    @Override
    public ResponseData querySongsByListId(long id) {
        try {
            List<Song> songs = songDao.querySongsByListId(id);
            return new ResponseData("0","返回成功",songs);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseData("9999","网络异常");
        }
    }

    @Override
    public ResponseData querySongsById(long id) {
        try {
            List<Song> songs = songDao.querySongsById(id);
            return new ResponseData("0","返回成功",songs);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseData("9999","网络异常");
        }
    }
}
