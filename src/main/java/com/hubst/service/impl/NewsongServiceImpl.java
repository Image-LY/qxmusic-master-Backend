package com.hubst.service.impl;

import com.hubst.entity.Newsong;
import com.hubst.dao.NewsongDao;
import com.hubst.entity.ResponseData;
import com.hubst.entity.Songlist;
import com.hubst.service.NewsongService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Newsong)表服务实现类
 *
 * @author makejava
 * @since 2023-08-03 10:42:01
 */
@Service("newsongService")
public class NewsongServiceImpl implements NewsongService {
    @Resource
    private NewsongDao newsongDao;

    /**
     * 通过ID查询单条数据
     *
     * @param typeid 主键
     * @return 实例对象
     */
    @Override
    public Newsong queryById(Long typeid) {
        return this.newsongDao.queryById(typeid);
    }

    /**
     * 分页查询
     *
     * @param newsong 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Newsong> queryByPage(Newsong newsong, PageRequest pageRequest) {
        long total = this.newsongDao.count(newsong);
        return new PageImpl<>(this.newsongDao.queryAllByLimit(newsong, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param newsong 实例对象
     * @return 实例对象
     */
    @Override
    public Newsong insert(Newsong newsong) {
        this.newsongDao.insert(newsong);
        return newsong;
    }

    /**
     * 修改数据
     *
     * @param newsong 实例对象
     * @return 实例对象
     */
    @Override
    public Newsong update(Newsong newsong) {
        this.newsongDao.update(newsong);
        return this.queryById(newsong.getTypeid());
    }

    /**
     * 通过主键删除数据
     *
     * @param typeid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long typeid) {
        return this.newsongDao.deleteById(typeid) > 0;
    }

    @Override
    public ResponseData getAllListInfo() {
        try {
            List<Songlist> songlists = newsongDao.getAllListInfo();
            return new ResponseData("0","请求成功",songlists);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseData("9999","网络错误");
        }
    }
}
