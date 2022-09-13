package com.weareop.weareopbackend.entity;

public class Up {
    private Long id;
    private String upName;
    private String upTagColor;
    private String upTagText;
    private Long subscribe;
    private Long totalViewCount;
    private Long totalLikeCount;
    private Long totalCoinCount;
    private Long totalCollectCount;
    private String password;
    private String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Long subscribe) {
        this.subscribe = subscribe;
    }

    public Long getTotalViewCount() {
        return totalViewCount;
    }

    public void setTotalViewCount(Long totalViewCount) {
        this.totalViewCount = totalViewCount;
    }

    public Long getTotalLikeCount() {
        return totalLikeCount;
    }

    public void setTotalLikeCount(Long totalLikeCount) {
        this.totalLikeCount = totalLikeCount;
    }

    public Long getTotalCoinCount() {
        return totalCoinCount;
    }

    public void setTotalCoinCount(Long totalCoinCount) {
        this.totalCoinCount = totalCoinCount;
    }

    public Long getTotalCollectCount() {
        return totalCollectCount;
    }

    public void setTotalCollectCount(Long totalCollectCount) {
        this.totalCollectCount = totalCollectCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
