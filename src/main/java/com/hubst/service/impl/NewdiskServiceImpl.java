package com.hubst.service.impl;

import com.hubst.entity.Newdisk;
import com.hubst.dao.NewdiskDao;
import com.hubst.entity.ResponseData;
import com.hubst.entity.Songlist;
import com.hubst.service.NewdiskService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Newdisk)表服务实现类
 *
 * @author makejava
 * @since 2023-08-03 11:04:45
 */
@Service("newdiskService")
public class NewdiskServiceImpl implements NewdiskService {
    @Resource
    private NewdiskDao newdiskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param diskid 主键
     * @return 实例对象
     */
    @Override
    public Newdisk queryById(Long diskid) {
        return this.newdiskDao.queryById(diskid);
    }

    /**
     * 分页查询
     *
     * @param newdisk 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Newdisk> queryByPage(Newdisk newdisk, PageRequest pageRequest) {
        long total = this.newdiskDao.count(newdisk);
        return new PageImpl<>(this.newdiskDao.queryAllByLimit(newdisk, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param newdisk 实例对象
     * @return 实例对象
     */
    @Override
    public Newdisk insert(Newdisk newdisk) {
        this.newdiskDao.insert(newdisk);
        return newdisk;
    }

    /**
     * 修改数据
     *
     * @param newdisk 实例对象
     * @return 实例对象
     */
    @Override
    public Newdisk update(Newdisk newdisk) {
        this.newdiskDao.update(newdisk);
        return this.queryById(newdisk.getDiskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param diskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long diskid) {
        return this.newdiskDao.deleteById(diskid) > 0;
    }

    @Override
    public ResponseData getAllListInfo() {
        try {
            List<Songlist> songlists = newdiskDao.getAllListInfo();
            return new ResponseData("0","请求成功",songlists);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseData("9999","网络错误");
        }
    }
}
