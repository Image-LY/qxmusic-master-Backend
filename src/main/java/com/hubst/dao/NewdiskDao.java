package com.hubst.dao;

import com.hubst.entity.Newdisk;
import com.hubst.entity.Songlist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Newdisk)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-03 11:04:45
 */
@Mapper
public interface NewdiskDao {

    /**
     * 通过ID查询单条数据
     *
     * @param diskid 主键
     * @return 实例对象
     */
    Newdisk queryById(Long diskid);

    /**
     * 查询指定行数据
     *
     * @param newdisk 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Newdisk> queryAllByLimit(Newdisk newdisk, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param newdisk 查询条件
     * @return 总行数
     */
    long count(Newdisk newdisk);

    /**
     * 新增数据
     *
     * @param newdisk 实例对象
     * @return 影响行数
     */
    int insert(Newdisk newdisk);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Newdisk> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Newdisk> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Newdisk> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Newdisk> entities);

    /**
     * 修改数据
     *
     * @param newdisk 实例对象
     * @return 影响行数
     */
    int update(Newdisk newdisk);

    /**
     * 通过主键删除数据
     *
     * @param diskid 主键
     * @return 影响行数
     */
    int deleteById(Long diskid);

    List<Songlist> getAllListInfo();
}

