package com.hubst.service.impl;

import com.hubst.entity.Rank;
import com.hubst.dao.RankDao;
import com.hubst.entity.ResponseData;
import com.hubst.entity.Songlist;
import com.hubst.service.RankService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Rank)表服务实现类
 *
 * @author makejava
 * @since 2023-08-03 10:42:01
 */
@Service("rankService")
public class RankServiceImpl implements RankService {
    @Resource
    private RankDao rankDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rankid 主键
     * @return 实例对象
     */
    @Override
    public Rank queryById(Long rankid) {
        return this.rankDao.queryById(rankid);
    }

    /**
     * 分页查询
     *
     * @param rank 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Rank> queryByPage(Rank rank, PageRequest pageRequest) {
        long total = this.rankDao.count(rank);
        return new PageImpl<>(this.rankDao.queryAllByLimit(rank, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    @Override
    public Rank insert(Rank rank) {
        this.rankDao.insert(rank);
        return rank;
    }

    /**
     * 修改数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    @Override
    public Rank update(Rank rank) {
        this.rankDao.update(rank);
        return this.queryById(rank.getRankid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rankid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long rankid) {
        return this.rankDao.deleteById(rankid) > 0;
    }

    @Override
    public ResponseData getAllListInfo() {
        try {
            List<Songlist> songlists = rankDao.getAllListInfo();
            return new ResponseData("0","请求成功",songlists);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseData("9999","网络错误");
        }
    }

    @Override
    public ResponseData queryByContentId() {
        try {
            List<Rank> ranks = rankDao.queryByContentId();
            return new ResponseData("0", "请求成功", ranks);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseData("9999","网络错误");
        }
    }
}
