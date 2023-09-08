package com.hubst.controller;

import com.hubst.entity.RankContent;
import com.hubst.entity.ResponseData;
import com.hubst.service.RankContentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RankContent)表控制层
 *
 * @author makejava
 * @since 2023-08-03 13:27:42
 */
@RestController
@RequestMapping("rankContent")
public class RankContentController {
    /**
     * 服务对象
     */
    @Resource
    private RankContentService rankContentService;

    /**
     * 分页查询
     *
     * @param rankContent 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<RankContent>> queryByPage(RankContent rankContent, PageRequest pageRequest) {
        return ResponseEntity.ok(this.rankContentService.queryByPage(rankContent, pageRequest));
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<RankContent> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.rankContentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param rankContent 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<RankContent> add(RankContent rankContent) {
        return ResponseEntity.ok(this.rankContentService.insert(rankContent));
    }

    /**
     * 编辑数据
     *
     * @param rankContent 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<RankContent> edit(RankContent rankContent) {
        return ResponseEntity.ok(this.rankContentService.update(rankContent));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.rankContentService.deleteById(id));
    }

}

