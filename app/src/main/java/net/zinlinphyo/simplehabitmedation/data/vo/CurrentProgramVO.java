package net.zinlinphyo.simplehabitmedation.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentProgramVO implements HomeScreenVO{

    @SerializedName("program-id")
    private String programId;

    @SerializedName("title")
    private String title;

    @SerializedName("current-period")
    private String currentPeriod;

    @SerializedName("background")
    private String background;

    @SerializedName("average-length")
    private List<Integer> averageLength;

    @SerializedName("description")
    private String description;

    @SerializedName("sessions")
    private List<SessionVO> sessions;

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setAverageLength(List<Integer> averageLength) {
        this.averageLength = averageLength;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSessions(List<SessionVO> sessions) {
        this.sessions = sessions;
    }

    public String getProgramId() {
        return programId;
    }

    public String getTitle() {
        return title;
    }

    public String getCurrentPeriod() {
        return currentPeriod;
    }

    public String getBackground() {
        return background;
    }

    public List<Integer> getAverageLength() {
        return averageLength;
    }

    public String getDescription() {
        return description;
    }

    public List<SessionVO> getSessions() {
        return sessions;
    }
}
