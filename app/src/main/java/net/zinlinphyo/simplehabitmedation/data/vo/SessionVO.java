package net.zinlinphyo.simplehabitmedation.data.vo;

import com.google.gson.annotations.SerializedName;

public class SessionVO {

    @SerializedName("session-id")
    private String sessionId;

    @SerializedName("title")
    private String title;

    @SerializedName("length-in-seconds")
    private String lengthInSeconds;

    @SerializedName("file-path")
    private String filePath;

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLengthInSeconds(String lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getTitle() {
        return title;
    }

    public String getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getFilePath() {
        return filePath;
    }
}
