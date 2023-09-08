package com.hubst.dao;

import com.hubst.entity.Newsong;
import com.hubst.entity.Songlist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Newsong)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-03 10:42:01
 */
@Mapper
public interface NewsongDao {

    /**
     * 通过ID查询单条数据
     *
     * @param typeid 主键
     * @return 实例对象
     */
    Newsong queryById(Long typeid);

    /**
     * 查询指定行数据
     *
     * @param newsong 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Newsong> queryAllByLimit(Newsong newsong, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param newsong 查询条件
     * @return 总行数
     */
    long count(Newsong newsong);

    /**
     * 新增数据
     *
     * @param newsong 实例对象
     * @return 影响行数
     */
    int insert(Newsong newsong);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Newsong> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Newsong> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Newsong> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Newsong> entities);

    /**
     * 修改数据
     *
     * @param newsong 实例对象
     * @return 影响行数
     */
    int update(Newsong newsong);

    /**
     * 通过主键删除数据
     *
     * @param typeid 主键
     * @return 影响行数
     */
    int deleteById(Long typeid);

    List<Songlist> getAllListInfo();
}

