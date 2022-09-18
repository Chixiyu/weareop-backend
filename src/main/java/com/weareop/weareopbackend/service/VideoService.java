package com.weareop.weareopbackend.service;

import com.weareop.weareopbackend.entity.Video;
import com.weareop.weareopbackend.mapper.VideoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoService {

    @Resource
    public VideoMapper videoMapper;

    private static final Logger LOG= LoggerFactory.getLogger(LoginService.class);

    public List<Video> getVideoList() {
        return videoMapper.getVideoList();
    }

    public Video getVideoById(String videoId){
        try{
            return videoMapper.getVideoById(videoId);
        }
        catch (Exception e){
            LOG.error(e.getMessage());
            return null;
        }
    }
}
