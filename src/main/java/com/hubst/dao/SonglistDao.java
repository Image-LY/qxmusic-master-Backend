package com.hubst.dao;

import com.hubst.entity.Songlist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Songlist)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-02 23:54:15
 */
@Mapper
public interface SonglistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param listid 主键
     * @return 实例对象
     */
    Songlist queryById(Long listid);

    /**
     * 查询指定行数据
     *
     * @param songlist 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Songlist> queryAllByLimit(Songlist songlist, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param songlist 查询条件
     * @return 总行数
     */
    long count(Songlist songlist);

    /**
     * 新增数据
     *
     * @param songlist 实例对象
     * @return 影响行数
     */
    int insert(Songlist songlist);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Songlist> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Songlist> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Songlist> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Songlist> entities);

    /**
     * 修改数据
     *
     * @param songlist 实例对象
     * @return 影响行数
     */
    int update(Songlist songlist);

    /**
     * 通过主键删除数据
     *
     * @param listid 主键
     * @return 影响行数
     */
    int deleteById(Long listid);

    List<Songlist> getAllListInfo();
}

