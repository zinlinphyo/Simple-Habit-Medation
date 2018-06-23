package net.zinlinphyo.simplehabitmedation.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProgramVO {

    @SerializedName("program-id")
    private String programId;

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String image;

    @SerializedName("average-lengths")
    private List<Integer> averageLengths;

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

    public void setImage(String image) {
        this.image = image;
    }

    public void setAverageLengths(List<Integer> averageLengths) {
        this.averageLengths = averageLengths;
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

    public String getImage() {
        return image;
    }

    public List<Integer> getAverageLengths() {
        return averageLengths;
    }

    public String getDescription() {
        return description;
    }

    public List<SessionVO> getSessions() {
        return sessions;
    }
}
