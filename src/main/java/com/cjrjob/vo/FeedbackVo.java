package com.cjrjob.vo;

/**
 * 界面反馈信息
 *
 * @author wutianjue
 */
public class FeedbackVo {
    private int userId;
    private String feedbackContent;
    private String feedbackKind;
    private String contact;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getFeedbackKind() {
        return feedbackKind;
    }

    public void setFeedbackKind(String feedbackKind) {
        this.feedbackKind = feedbackKind;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}