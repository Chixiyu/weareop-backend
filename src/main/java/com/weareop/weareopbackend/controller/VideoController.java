package com.weareop.weareopbackend.controller;

import com.weareop.weareopbackend.entity.Video;
import com.weareop.weareopbackend.service.VideoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VideoController {

    @Resource
    public VideoService videoService;

    @GetMapping("/videos")
    public List<Video> getVideoList(){
        List<Video> videos=videoService.getVideoList();
        return videos;
    }

    @GetMapping("/oneVideo")
    public Video getVideoById(String videoId){
        return videoService.getVideoById(videoId);
    }
}
