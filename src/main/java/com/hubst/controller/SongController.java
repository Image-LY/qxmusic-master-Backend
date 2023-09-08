package com.hubst.controller;

import com.hubst.entity.ResponseData;
import com.hubst.entity.Song;
import com.hubst.service.SongService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Song)表控制层
 *
 * @author makejava
 * @since 2023-08-01 21:59:31
 */
@RestController
@RequestMapping("song")
public class SongController {
    /**
     * 服务对象
     */
    @Resource
    private SongService songService;

    /**
     * 分页查询
     *
     * @param song 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Song>> queryByPage(Song song, PageRequest pageRequest) {
        return ResponseEntity.ok(this.songService.queryByPage(song, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Song> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.songService.queryById(id));
    }

    @ApiOperation(value = "获取主页歌曲信息",notes = "主页获取")
    @GetMapping("getIndexSongInfo")
    public ResponseData getIndexSongInfo()
    {
        return songService.getIndexSongInfo();
    };

    @ApiOperation(value = "获取全部歌曲信息",notes = "全部获取")
    @GetMapping("getAllSongInfo")
    public ResponseData getAllSongInfo()
    {
        return songService.getAllSongInfo();
    };

    @ApiOperation(value = "根据歌单id查询对应歌曲",notes = "参数：id")
    @GetMapping("querySongsByListId")
    public ResponseData querySongsByListId(long id){
        return songService.querySongsByListId(id);
    }

    @ApiOperation(value = "根据歌曲id查询对应歌曲")
    @GetMapping("querySongsById")
    public ResponseData querySongsById(long id){
        return songService.querySongsById(id);
    }


    /**
     * 新增数据
     *
     * @param song 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Song> add(Song song) {
        return ResponseEntity.ok(this.songService.insert(song));
    }

    /**
     * 编辑数据
     *
     * @param song 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Song> edit(Song song) {
        return ResponseEntity.ok(this.songService.update(song));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.songService.deleteById(id));
    }

}

