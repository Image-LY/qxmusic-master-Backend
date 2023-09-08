package com.hubst.dao;

import com.hubst.entity.Rank;
import com.hubst.entity.RankContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (RankContent)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-03 13:27:42
 */
@Mapper
public interface RankContentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param rankid 主键
     * @return 实例对象
     */
    RankContent queryById(Long rankid);

    /**
     * 查询指定行数据
     *
     * @param rankContent 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<RankContent> queryAllByLimit(RankContent rankContent, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param rankContent 查询条件
     * @return 总行数
     */
    long count(RankContent rankContent);

    /**
     * 新增数据
     *
     * @param rankContent 实例对象
     * @return 影响行数
     */
    int insert(RankContent rankContent);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<RankContent> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<RankContent> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<RankContent> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<RankContent> entities);

    /**
     * 修改数据
     *
     * @param rankContent 实例对象
     * @return 影响行数
     */
    int update(RankContent rankContent);

    /**
     * 通过主键删除数据
     *
     * @param rankid 主键
     * @return 影响行数
     */
    int deleteById(Long rankid);

    List<Rank> queryByContentId(String contentid);
}

