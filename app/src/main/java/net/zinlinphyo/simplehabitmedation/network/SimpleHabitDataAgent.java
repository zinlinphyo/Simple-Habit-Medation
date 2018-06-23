package net.zinlinphyo.simplehabitmedation.network;

public interface SimpleHabitDataAgent {
    void loadCurrentPrograms(String accessToken, int pageNo);

    void loadCategories(String accessToken, int pageNo);

    void loadTopics(String accessToken, int pageNo);
}
