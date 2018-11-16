package com.www.course.c09.model;

public class Resume {
    private int resumeId;
    private int userId;
    private String resumeName;
    private String resumeDesc;

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public String getResumeDesc() {
        return resumeDesc;
    }

    public void setResumeDesc(String resumeDesc) {
        this.resumeDesc = resumeDesc;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resumeId=" + resumeId +
                ", userId=" + userId +
                ", resumeName='" + resumeName + '\'' +
                ", resumeDesc='" + resumeDesc + '\'' +
                '}';
    }
}
