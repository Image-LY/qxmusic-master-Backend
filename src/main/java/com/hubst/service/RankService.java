package com.hubst.service;

import com.hubst.entity.Rank;
import com.hubst.entity.ResponseData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Rank)表服务接口
 *
 * @author makejava
 * @since 2023-08-03 10:42:01
 */
public interface RankService {

    /**
     * 通过ID查询单条数据
     *
     * @param rankid 主键
     * @return 实例对象
     */
    Rank queryById(Long rankid);

    /**
     * 分页查询
     *
     * @param rank 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Rank> queryByPage(Rank rank, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    Rank insert(Rank rank);

    /**
     * 修改数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    Rank update(Rank rank);

    /**
     * 通过主键删除数据
     *
     * @param rankid 主键
     * @return 是否成功
     */
    boolean deleteById(Long rankid);

    ResponseData getAllListInfo();

    ResponseData queryByContentId();
}
