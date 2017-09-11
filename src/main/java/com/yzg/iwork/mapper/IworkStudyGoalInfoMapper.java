package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkStudyGoalInfo;
import com.yzg.iwork.pojo.IworkStudyGoalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkStudyGoalInfoMapper {
    long countByExample(IworkStudyGoalInfoExample example);

    int deleteByExample(IworkStudyGoalInfoExample example);

    int deleteByPrimaryKey(Integer studygoalinfoid);

    int insert(IworkStudyGoalInfo record);

    int insertSelective(IworkStudyGoalInfo record);

    List<IworkStudyGoalInfo> selectByExampleWithBLOBs(IworkStudyGoalInfoExample example);

    List<IworkStudyGoalInfo> selectByExample(IworkStudyGoalInfoExample example);

    IworkStudyGoalInfo selectByPrimaryKey(Integer studygoalinfoid);

    int updateByExampleSelective(@Param("record") IworkStudyGoalInfo record, @Param("example") IworkStudyGoalInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkStudyGoalInfo record, @Param("example") IworkStudyGoalInfoExample example);

    int updateByExample(@Param("record") IworkStudyGoalInfo record, @Param("example") IworkStudyGoalInfoExample example);

    int updateByPrimaryKeySelective(IworkStudyGoalInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkStudyGoalInfo record);

    int updateByPrimaryKey(IworkStudyGoalInfo record);
}