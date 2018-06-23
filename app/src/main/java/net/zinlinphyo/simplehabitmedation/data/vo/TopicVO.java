package net.zinlinphyo.simplehabitmedation.data.vo;

import com.google.gson.annotations.SerializedName;

public class TopicVO implements HomeScreenVO{

    @SerializedName("topic-name")
    private String topicName;

    @SerializedName("topic-desc")
    private String topicDesc;

    @SerializedName("icon")
    private String icon;

    @SerializedName("background")
    private String background;

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public void setTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getTopicDesc() {
        return topicDesc;
    }

    public String getIcon() {
        return icon;
    }

    public String getBackground() {
        return background;
    }
}
