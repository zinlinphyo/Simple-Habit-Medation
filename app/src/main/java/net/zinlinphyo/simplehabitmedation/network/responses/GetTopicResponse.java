package net.zinlinphyo.simplehabitmedation.network.responses;

import net.zinlinphyo.simplehabitmedation.data.vo.TopicVO;

import java.util.List;

/**
 * Created by zinlinphyo on 5/23/18.
 */

public class GetTopicResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<TopicVO> topics;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<TopicVO> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicVO> topics) {
        this.topics = topics;
    }
}
