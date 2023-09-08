package com.hubst.service.impl;

import com.hubst.entity.Rank;
import com.hubst.entity.RankContent;
import com.hubst.dao.RankContentDao;
import com.hubst.entity.ResponseData;
import com.hubst.service.RankContentService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RankContent)表服务实现类
 *
 * @author makejava
 * @since 2023-08-03 13:27:42
 */
@Service("rankContentService")
public class RankContentServiceImpl implements RankContentService {
    @Resource
    private RankContentDao rankContentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rankid 主键
     * @return 实例对象
     */
    @Override
    public RankContent queryById(Long rankid) {
        return this.rankContentDao.queryById(rankid);
    }

    /**
     * 分页查询
     *
     * @param rankContent 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<RankContent> queryByPage(RankContent rankContent, PageRequest pageRequest) {
        long total = this.rankContentDao.count(rankContent);
        return new PageImpl<>(this.rankContentDao.queryAllByLimit(rankContent, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param rankContent 实例对象
     * @return 实例对象
     */
    @Override
    public RankContent insert(RankContent rankContent) {
        this.rankContentDao.insert(rankContent);
        return rankContent;
    }

    /**
     * 修改数据
     *
     * @param rankContent 实例对象
     * @return 实例对象
     */
    @Override
    public RankContent update(RankContent rankContent) {
        this.rankContentDao.update(rankContent);
        return this.queryById(rankContent.getRankid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rankid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long rankid) {
        return this.rankContentDao.deleteById(rankid) > 0;
    }

}
