package me.iys123.VideoShow.service;

import me.iys123.VideoShow.model.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by YS on 2017/9/15.
 */
@Mapper
public interface VideoService {
    /**
     * 查询所有
     *
     * @return
     */
    @Select("select id,video_url,comment from video")
    List<Video> selectAll();
}
