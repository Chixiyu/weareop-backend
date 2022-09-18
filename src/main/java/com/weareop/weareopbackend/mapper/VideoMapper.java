package com.weareop.weareopbackend.mapper;


import com.weareop.weareopbackend.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VideoMapper {

    @Select("select video.id as videoId,cover,video,name,view_count,like_count,coin_count,collect_count,up.id as upId, up_name,up_tag_color,up_tag_text from video join up on video.up_id=up.id;")
    public List<Video> getVideoList();

    @Select("select video.id as videoId,cover,video,name,view_count,like_count,coin_count,collect_count,up.id as upId, up_name,up_tag_color,up_tag_text from video join up on video.up_id=up.id where video.id=#{videoId};")
    public Video getVideoById(String videoId);
}
