package com.weareop.weareopbackend.service;

import com.weareop.weareopbackend.entity.Video;
import com.weareop.weareopbackend.mapper.VideoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoService {

    @Resource
    public VideoMapper videoMapper;

    public List<Video> getVideoList(){
        return videoMapper.getVideoList();
    }
}
