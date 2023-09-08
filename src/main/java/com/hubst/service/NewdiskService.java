package com.hubst.service;

import com.hubst.entity.Newdisk;
import com.hubst.entity.ResponseData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Newdisk)表服务接口
 *
 * @author makejava
 * @since 2023-08-03 11:04:45
 */
public interface NewdiskService {

    /**
     * 通过ID查询单条数据
     *
     * @param diskid 主键
     * @return 实例对象
     */
    Newdisk queryById(Long diskid);

    /**
     * 分页查询
     *
     * @param newdisk 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Newdisk> queryByPage(Newdisk newdisk, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param newdisk 实例对象
     * @return 实例对象
     */
    Newdisk insert(Newdisk newdisk);

    /**
     * 修改数据
     *
     * @param newdisk 实例对象
     * @return 实例对象
     */
    Newdisk update(Newdisk newdisk);

    /**
     * 通过主键删除数据
     *
     * @param diskid 主键
     * @return 是否成功
     */
    boolean deleteById(Long diskid);

    ResponseData getAllListInfo();
}
