package com.cjrjob.pojo;

import java.util.Date;

public class BannerInfo {
    private Integer bannerInfoId;

    private String imgUri;

    private String imgContent;

    private Date createTime;

    private String backup;

    public BannerInfo(Integer bannerInfoId, String imgUri, String imgContent, Date createTime, String backup) {
        this.bannerInfoId = bannerInfoId;
        this.imgUri = imgUri;
        this.imgContent = imgContent;
        this.createTime = createTime;
        this.backup = backup;
    }

    public BannerInfo() {
        super();
    }

    public Integer getBannerInfoId() {
        return bannerInfoId;
    }

    public void setBannerInfoId(Integer bannerInfoId) {
        this.bannerInfoId = bannerInfoId;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri == null ? null : imgUri.trim();
    }

    public String getImgContent() {
        return imgContent;
    }

    public void setImgContent(String imgContent) {
        this.imgContent = imgContent == null ? null : imgContent.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup == null ? null : backup.trim();
    }
}