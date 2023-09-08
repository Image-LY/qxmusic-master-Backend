package com.hubst.service;

import com.hubst.entity.ResponseData;
import com.hubst.entity.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Song)表服务接口
 *
 * @author makejava
 * @since 2023-08-01 21:59:32
 */
public interface SongService {

    /**
     * 通过ID查询单条数据
     *
     * @param songid 主键
     * @return 实例对象
     */
    Song queryById(Integer songid);

    /**
     * 分页查询
     *
     * @param song 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Song> queryByPage(Song song, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    Song insert(Song song);

    /**
     * 修改数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    Song update(Song song);

    /**
     * 通过主键删除数据
     *
     * @param songid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer songid);

    ResponseData getIndexSongInfo();

    ResponseData getAllSongInfo();

    ResponseData querySongsByListId(long id);

    ResponseData querySongsById(long id);
}
