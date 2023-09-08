package com.hubst.service.impl;

import com.hubst.entity.ResponseData;
import com.hubst.entity.Songlist;
import com.hubst.dao.SonglistDao;
import com.hubst.service.SonglistService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Songlist)表服务实现类
 *
 * @author makejava
 * @since 2023-08-02 23:54:15
 */
@Service("songlistService")
public class SonglistServiceImpl implements SonglistService {
    @Resource
    private SonglistDao songlistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param listid 主键
     * @return 实例对象
     */
    @Override
    public Songlist queryById(Long listid) {
        return this.songlistDao.queryById(listid);
    }

    /**
     * 分页查询
     *
     * @param songlist 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Songlist> queryByPage(Songlist songlist, PageRequest pageRequest) {
        long total = this.songlistDao.count(songlist);
        return new PageImpl<>(this.songlistDao.queryAllByLimit(songlist, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param songlist 实例对象
     * @return 实例对象
     */
    @Override
    public Songlist insert(Songlist songlist) {
        this.songlistDao.insert(songlist);
        return songlist;
    }

    /**
     * 修改数据
     *
     * @param songlist 实例对象
     * @return 实例对象
     */
    @Override
    public Songlist update(Songlist songlist) {
        this.songlistDao.update(songlist);
        return this.queryById(songlist.getListid());
    }

    /**
     * 通过主键删除数据
     *
     * @param listid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long listid) {
        return this.songlistDao.deleteById(listid) > 0;
    }

    @Override
    public ResponseData getAllListInfo() {
        try {
            List<Songlist> songlists = songlistDao.getAllListInfo();
            return new ResponseData("0","请求成功",songlists);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseData("9999","网络错误");
        }
    }
}
