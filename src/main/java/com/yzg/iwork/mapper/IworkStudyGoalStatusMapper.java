package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkStudyGoalStatus;
import com.yzg.iwork.pojo.IworkStudyGoalStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkStudyGoalStatusMapper {
    long countByExample(IworkStudyGoalStatusExample example);

    int deleteByExample(IworkStudyGoalStatusExample example);

    int deleteByPrimaryKey(Integer studygoalstatusid);

    int insert(IworkStudyGoalStatus record);

    int insertSelective(IworkStudyGoalStatus record);

    List<IworkStudyGoalStatus> selectByExample(IworkStudyGoalStatusExample example);

    IworkStudyGoalStatus selectByPrimaryKey(Integer studygoalstatusid);

    int updateByExampleSelective(@Param("record") IworkStudyGoalStatus record, @Param("example") IworkStudyGoalStatusExample example);

    int updateByExample(@Param("record") IworkStudyGoalStatus record, @Param("example") IworkStudyGoalStatusExample example);

    int updateByPrimaryKeySelective(IworkStudyGoalStatus record);

    int updateByPrimaryKey(IworkStudyGoalStatus record);
}