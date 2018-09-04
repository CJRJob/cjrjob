
package com.cjrjob.pojo;

import java.util.Date;

public class BannerInfo {
    private Integer bannerInfoId;

    private String imgUri;

    private String imgContent;

    private Date createTime;

    public BannerInfo(Integer bannerInfoId, String imgUri, String imgContent, Date createTime) {
        this.bannerInfoId = bannerInfoId;
        this.imgUri = imgUri;
        this.imgContent = imgContent;
        this.createTime = createTime;
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
}