package com.hubst.controller;

import com.hubst.entity.Newdisk;
import com.hubst.entity.ResponseData;
import com.hubst.service.NewdiskService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Newdisk)表控制层
 *
 * @author makejava
 * @since 2023-08-03 11:04:45
 */
@RestController
@RequestMapping("newdisk")
public class NewdiskController {
    /**
     * 服务对象
     */
    @Resource
    private NewdiskService newdiskService;

    /**
     * 分页查询
     *
     * @param newdisk 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Newdisk>> queryByPage(Newdisk newdisk, PageRequest pageRequest) {
        return ResponseEntity.ok(this.newdiskService.queryByPage(newdisk, pageRequest));
    }

    @ApiOperation(value = "获取全部专辑信息",notes = "直接查询")
    @GetMapping("getAllListInfo")
    public ResponseData getAllListInfo(){
        return newdiskService.getAllListInfo();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Newdisk> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.newdiskService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param newdisk 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Newdisk> add(Newdisk newdisk) {
        return ResponseEntity.ok(this.newdiskService.insert(newdisk));
    }

    /**
     * 编辑数据
     *
     * @param newdisk 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Newdisk> edit(Newdisk newdisk) {
        return ResponseEntity.ok(this.newdiskService.update(newdisk));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.newdiskService.deleteById(id));
    }

}

