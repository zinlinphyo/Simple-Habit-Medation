package net.zinlinphyo.simplehabitmedation.network.responses;

import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;

import java.util.List;

/**
 * Created by zinlinphyo on 5/23/18.
 */

public class GetCategoriesResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<CategoryVO> categoriesPrograms;

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

    public List<CategoryVO> getCategoriesPrograms() {
        return categoriesPrograms;
    }

    public void setCategoriesPrograms(List<CategoryVO> categoriesPrograms) {
        this.categoriesPrograms = categoriesPrograms;
    }
}
