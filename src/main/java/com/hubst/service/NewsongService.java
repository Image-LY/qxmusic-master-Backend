package com.hubst.service;

import com.hubst.entity.Newsong;
import com.hubst.entity.ResponseData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Newsong)表服务接口
 *
 * @author makejava
 * @since 2023-08-03 10:42:01
 */
public interface NewsongService {

    /**
     * 通过ID查询单条数据
     *
     * @param typeid 主键
     * @return 实例对象
     */
    Newsong queryById(Long typeid);

    /**
     * 分页查询
     *
     * @param newsong 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Newsong> queryByPage(Newsong newsong, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param newsong 实例对象
     * @return 实例对象
     */
    Newsong insert(Newsong newsong);

    /**
     * 修改数据
     *
     * @param newsong 实例对象
     * @return 实例对象
     */
    Newsong update(Newsong newsong);

    /**
     * 通过主键删除数据
     *
     * @param typeid 主键
     * @return 是否成功
     */
    boolean deleteById(Long typeid);

    ResponseData getAllListInfo();
}
