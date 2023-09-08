package com.hubst.service;

import com.hubst.entity.ResponseData;
import com.hubst.entity.Songlist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Songlist)表服务接口
 *
 * @author makejava
 * @since 2023-08-02 23:54:15
 */
public interface SonglistService {

    /**
     * 通过ID查询单条数据
     *
     * @param listid 主键
     * @return 实例对象
     */
    Songlist queryById(Long listid);

    /**
     * 分页查询
     *
     * @param songlist 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Songlist> queryByPage(Songlist songlist, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param songlist 实例对象
     * @return 实例对象
     */
    Songlist insert(Songlist songlist);

    /**
     * 修改数据
     *
     * @param songlist 实例对象
     * @return 实例对象
     */
    Songlist update(Songlist songlist);

    /**
     * 通过主键删除数据
     *
     * @param listid 主键
     * @return 是否成功
     */
    boolean deleteById(Long listid);

    ResponseData getAllListInfo();
}
