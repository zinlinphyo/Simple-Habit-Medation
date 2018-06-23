package net.zinlinphyo.simplehabitmedation.mvp.views;

import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.ProgramVO;

import java.util.List;

public interface DetailsView extends BaseView {

	void displayCurrentProgramData(CurrentProgramVO data);

	void displayCategoryData(ProgramVO data);
}
