package net.zinlinphyo.simplehabitmedation.mvp.views;

import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.HomeScreenVO;

import java.util.List;

public interface SeriesView extends BaseView {

	void displayData(List<HomeScreenVO> data);

	void launchCurrentProgramDetailsScreen(CurrentProgramVO data);

	void launchCategoryDetailsScreen(String categoryId, String programId);
}
