package com.stone.it.rcms.base.dao;

import com.stone.it.rcms.base.vo.ClassifyVO;
import com.stone.it.rcms.base.vo.ItemVO;
import com.stone.it.rcms.core.vo.PageResult;
import com.stone.it.rcms.core.vo.PageVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author cj.stone
 * @Desc
 */
public interface IItemDao {

    PageResult<ClassifyVO> findPageResult(ClassifyVO classifyVO, PageVO pageVO);

    int createClassify(ClassifyVO classifyVO);

    int updateClassify(ClassifyVO classifyVO);

    int deleteClassify(@Param("classifyCode") String classifyCode);

    List<ItemVO> findClassifyItemByCodeLang(@Param("classifyCode") String classifyCode,
        @Param("language") String language);

    int createClassifyItem(ItemVO itemVO);

    int updateClassifyItem(ItemVO itemVO);

    int deleteClassifyItem(@Param("itemId") String itemId);

    PageResult<ItemVO> findClassifyItemPageResult(ItemVO itemVO, PageVO pageVO);
}
