package com.weareop.weareopbackend.entity;

public class Video {
    private Long videoId;
    private String cover;
    private String video;
    private String name;
    private Long viewCount;
    private Long likeCount;
    private Long coinCount;
    private Long collectCount;
    private Long upId;
    private String upName;
    private String upTagColor;
    private String upTagText;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public Long getCoinCount() {
        return coinCount;
    }

    public void setCoinCount(Long coinCount) {
        this.coinCount = coinCount;
    }

    public Long getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Long collectCount) {
        this.collectCount = collectCount;
    }

    public Long getUpId() {
        return upId;
    }

    public void setUpId(Long upId) {
        this.upId = upId;
    }

    public String getUpName() {
        return upName;
    }

    public void setUpName(String upName) {
        this.upName = upName;
    }

    public String getUpTagColor() {
        return upTagColor;
    }

    public void setUpTagColor(String upTagColor) {
        this.upTagColor = upTagColor;
    }

    public String getUpTagText() {
        return upTagText;
    }

    public void setUpTagText(String upTagText) {
        this.upTagText = upTagText;
    }
}
