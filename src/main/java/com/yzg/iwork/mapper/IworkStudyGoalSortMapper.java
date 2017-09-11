package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkStudyGoalSort;
import com.yzg.iwork.pojo.IworkStudyGoalSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkStudyGoalSortMapper {
    long countByExample(IworkStudyGoalSortExample example);

    int deleteByExample(IworkStudyGoalSortExample example);

    int deleteByPrimaryKey(Integer studygoalsortid);

    int insert(IworkStudyGoalSort record);

    int insertSelective(IworkStudyGoalSort record);

    List<IworkStudyGoalSort> selectByExample(IworkStudyGoalSortExample example);

    IworkStudyGoalSort selectByPrimaryKey(Integer studygoalsortid);

    int updateByExampleSelective(@Param("record") IworkStudyGoalSort record, @Param("example") IworkStudyGoalSortExample example);

    int updateByExample(@Param("record") IworkStudyGoalSort record, @Param("example") IworkStudyGoalSortExample example);

    int updateByPrimaryKeySelective(IworkStudyGoalSort record);

    int updateByPrimaryKey(IworkStudyGoalSort record);
}