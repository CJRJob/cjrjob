package com.cjrjob.pojo;

public class PublicInfo {
    private Integer publicInfoId;

    private String kind;

    private String name;

    private String url;

    private String content;

    public PublicInfo(Integer publicInfoId, String kind, String name, String url, String content) {
        this.publicInfoId = publicInfoId;
        this.kind = kind;
        this.name = name;
        this.url = url;
        this.content = content;
    }

    public PublicInfo() {
        super();
    }

    public Integer getPublicInfoId() {
        return publicInfoId;
    }

    public void setPublicInfoId(Integer publicInfoId) {
        this.publicInfoId = publicInfoId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}