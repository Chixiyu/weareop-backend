package com.weareop.weareopbackend.mapper;


import com.weareop.weareopbackend.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VideoMapper {

    @Select("select * from video")
    public List<Video> getVideoList();
}
