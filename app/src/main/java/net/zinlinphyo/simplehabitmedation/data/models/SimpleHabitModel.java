package net.zinlinphyo.simplehabitmedation.data.models;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.HomeScreenVO;
import net.zinlinphyo.simplehabitmedation.data.vo.ProgramVO;
import net.zinlinphyo.simplehabitmedation.events.DataReadyEvent;
import net.zinlinphyo.simplehabitmedation.events.RestApiEvents;
import net.zinlinphyo.simplehabitmedation.network.SimpleHabitDataAgentImp;
import net.zinlinphyo.simplehabitmedation.utils.AppConstants;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class SimpleHabitModel {

    private static SimpleHabitModel objInstance;

    private List<HomeScreenVO> mHomeScreen;
    private int mmNewsPageIndex = 1;

    private SimpleHabitModel() {
        EventBus.getDefault().register(this);
        mHomeScreen = new ArrayList<>();
    }

    public static SimpleHabitModel getInstance() {
        if(objInstance == null) {
            objInstance = new SimpleHabitModel();
        }
        return objInstance;
    }

    public void startLoadingSimpleHabits() {
        SimpleHabitDataAgentImp.getInstance().loadCurrentPrograms(AppConstants.ACCESS_TOKEN, mmNewsPageIndex);
//        SimpleHabitDataAgentImp.getInstance().loadCategories(AppConstants.ACCESS_TOKEN, mmNewsPageIndex);
//        SimpleHabitDataAgentImp.getInstance().loadTopics(AppConstants.ACCESS_TOKEN, mmNewsPageIndex);
    }

    @Subscribe
    public void onCurrentProgramDataLoaded(RestApiEvents.CurrentProgramsDataLoadedEvent event) {
        mHomeScreen.add(event.getLoadCurrentPrograms());

        SimpleHabitDataAgentImp.getInstance().loadCategories(AppConstants.ACCESS_TOKEN, mmNewsPageIndex);
    }

    @Subscribe
    public void onCategoriesDataLoaded(RestApiEvents.CategoriesDataLoadedEvent event) {
        mHomeScreen.addAll(event.getLoadCategories());

        SimpleHabitDataAgentImp.getInstance().loadTopics(AppConstants.ACCESS_TOKEN, mmNewsPageIndex);
    }

    @Subscribe
    public void onTopicsDataLoaded(RestApiEvents.TopicsDataLoadedEvent event) {
        mHomeScreen.addAll(event.getLoadTopics());

        DataReadyEvent dataReadyEvent = new DataReadyEvent(mHomeScreen);
        EventBus.getDefault().post(dataReadyEvent);
    }

    public CurrentProgramVO getCurrentProgram() {
        for(HomeScreenVO homeScreen : mHomeScreen) {
            if(homeScreen instanceof CurrentProgramVO)
                return (CurrentProgramVO) homeScreen;
        }

        return null;
    }

    public @Nullable
    ProgramVO getCategoryById(String categoryId, String programId) {
        for(HomeScreenVO homeScreen : mHomeScreen) {
            if((homeScreen instanceof CategoryVO) && TextUtils.equals(((CategoryVO) homeScreen).getCategoryId(), categoryId)){
                CategoryVO categoryVO = (CategoryVO) homeScreen;
                if (TextUtils.equals(categoryId, categoryVO.getCategoryId())) {
                    for (ProgramVO programVO : categoryVO.getPrograms()) {
                        if (TextUtils.equals(programId, programVO.getProgramId())) {
                            return programVO;
                        }
                    }
                }
            }
        }
        return null;
    }
}
