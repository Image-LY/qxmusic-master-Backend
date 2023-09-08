package com.hubst.controller;

import com.hubst.entity.Newsong;
import com.hubst.entity.ResponseData;
import com.hubst.service.NewsongService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Newsong)表控制层
 *
 * @author makejava
 * @since 2023-08-03 10:42:01
 */
@RestController
@RequestMapping("newsong")
public class NewsongController {
    /**
     * 服务对象
     */
    @Resource
    private NewsongService newsongService;

    /**
     * 分页查询
     *
     * @param newsong 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */

    @GetMapping
    public ResponseEntity<Page<Newsong>> queryByPage(Newsong newsong, PageRequest pageRequest) {
        return ResponseEntity.ok(this.newsongService.queryByPage(newsong, pageRequest));
    }

    @ApiOperation(value = "获取全部歌曲分类信息",notes = "直接查询")
    @GetMapping("getAllListInfo")
    public ResponseData getAllListInfo(){
        return newsongService.getAllListInfo();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Newsong> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.newsongService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param newsong 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Newsong> add(Newsong newsong) {
        return ResponseEntity.ok(this.newsongService.insert(newsong));
    }

    /**
     * 编辑数据
     *
     * @param newsong 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Newsong> edit(Newsong newsong) {
        return ResponseEntity.ok(this.newsongService.update(newsong));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.newsongService.deleteById(id));
    }

}

