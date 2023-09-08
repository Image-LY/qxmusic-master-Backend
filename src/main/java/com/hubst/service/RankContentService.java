package com.hubst.service;

import com.hubst.entity.RankContent;
import com.hubst.entity.ResponseData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (RankContent)表服务接口
 *
 * @author makejava
 * @since 2023-08-03 13:27:42
 */
public interface RankContentService {

    /**
     * 通过ID查询单条数据
     *
     * @param rankid 主键
     * @return 实例对象
     */
    RankContent queryById(Long rankid);

    /**
     * 分页查询
     *
     * @param rankContent 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<RankContent> queryByPage(RankContent rankContent, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param rankContent 实例对象
     * @return 实例对象
     */
    RankContent insert(RankContent rankContent);

    /**
     * 修改数据
     *
     * @param rankContent 实例对象
     * @return 实例对象
     */
    RankContent update(RankContent rankContent);

    /**
     * 通过主键删除数据
     *
     * @param rankid 主键
     * @return 是否成功
     */
    boolean deleteById(Long rankid);

}
