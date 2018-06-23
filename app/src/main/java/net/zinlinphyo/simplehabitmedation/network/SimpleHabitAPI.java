package net.zinlinphyo.simplehabitmedation.network;

import net.zinlinphyo.simplehabitmedation.network.responses.GetCategoriesResponse;
import net.zinlinphyo.simplehabitmedation.network.responses.GetCurrentProgramsResponse;
import net.zinlinphyo.simplehabitmedation.network.responses.GetTopicResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SimpleHabitAPI {
    @FormUrlEncoded
    @POST("getCurrentProgram.php")
    Call<GetCurrentProgramsResponse> loadCurrentPrograms(
            @Field("page") int pageIndex,
            @Field("access_token") String accessToken);

    @FormUrlEncoded
    @POST("getCategoriesPrograms.php")
    Call<GetCategoriesResponse> loadCategories(
            @Field("page") int pageIndex,
            @Field("access_token") String accessToken);

    @FormUrlEncoded
    @POST("getTopics.php")
    Call<GetTopicResponse> loadTopics(
            @Field("page") int pageIndex,
            @Field("access_token") String accessToken);
}
