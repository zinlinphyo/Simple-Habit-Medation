package net.zinlinphyo.simplehabitmedation.delegates;

import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.data.vo.ProgramVO;

public interface CategoryDelegate {

    void onTapCategory(String categoryId, String programId);
}
