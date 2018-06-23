package net.zinlinphyo.simplehabitmedation.events;

import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.TopicVO;

import java.util.List;

/**
 * Created by eidoshack on 5/23/18.
 */

public class RestApiEvents {

    public static class EmptyResponseEvent {

    }

    public static class ErrorInvokingAPIEvent {
        private String errorMsg;

        public ErrorInvokingAPIEvent(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }

    public static class CurrentProgramsDataLoadedEvent {
        private CurrentProgramVO loadCurrentPrograms;

        public CurrentProgramsDataLoadedEvent(CurrentProgramVO loadCurrentPrograms) {
            this.loadCurrentPrograms = loadCurrentPrograms;
        }

        public CurrentProgramVO getLoadCurrentPrograms() {
            return loadCurrentPrograms;
        }
    }

    public static class CategoriesDataLoadedEvent {
        private List<CategoryVO> loadCategories;

        public CategoriesDataLoadedEvent(List<CategoryVO> loadCategories) {
            this.loadCategories = loadCategories;
        }

        public List<CategoryVO> getLoadCategories() {
            return loadCategories;
        }
    }

    public static class TopicsDataLoadedEvent {
        private List<TopicVO> loadTopics;

        public TopicsDataLoadedEvent(List<TopicVO> loadTopics) {
            this.loadTopics = loadTopics;
        }

        public List<TopicVO> getLoadTopics() {
            return loadTopics;
        }
    }

}
