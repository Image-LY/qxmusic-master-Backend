package com.hubst.controller;

import com.hubst.entity.ResponseData;
import com.hubst.entity.Songlist;
import com.hubst.service.SonglistService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Songlist)表控制层
 *
 * @author makejava
 * @since 2023-08-02 23:54:15
 */
@RestController
@RequestMapping("songlist")
public class SonglistController {
    /**
     * 服务对象
     */
    @Resource
    private SonglistService songlistService;

    /**
     * 分页查询
     *
     * @param songlist 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Songlist>> queryByPage(Songlist songlist, PageRequest pageRequest) {
        return ResponseEntity.ok(this.songlistService.queryByPage(songlist, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Songlist> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.songlistService.queryById(id));
    }


    @ApiOperation(value = "获取全部歌单信息",notes = "直接查询")
    @GetMapping("getAllListInfo")
    public ResponseData getAllListInfo(){
        return songlistService.getAllListInfo();
    }

    /**
     * 新增数据
     *
     * @param songlist 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Songlist> add(Songlist songlist) {
        return ResponseEntity.ok(this.songlistService.insert(songlist));
    }

    /**
     * 编辑数据
     *
     * @param songlist 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Songlist> edit(Songlist songlist) {
        return ResponseEntity.ok(this.songlistService.update(songlist));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.songlistService.deleteById(id));
    }

}

