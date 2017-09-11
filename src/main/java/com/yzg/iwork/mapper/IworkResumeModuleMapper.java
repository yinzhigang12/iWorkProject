package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkResumeModule;
import com.yzg.iwork.pojo.IworkResumeModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkResumeModuleMapper {
    long countByExample(IworkResumeModuleExample example);

    int deleteByExample(IworkResumeModuleExample example);

    int deleteByPrimaryKey(Integer resumemoduleid);

    int insert(IworkResumeModule record);

    int insertSelective(IworkResumeModule record);

    List<IworkResumeModule> selectByExample(IworkResumeModuleExample example);

    IworkResumeModule selectByPrimaryKey(Integer resumemoduleid);

    int updateByExampleSelective(@Param("record") IworkResumeModule record, @Param("example") IworkResumeModuleExample example);

    int updateByExample(@Param("record") IworkResumeModule record, @Param("example") IworkResumeModuleExample example);

    int updateByPrimaryKeySelective(IworkResumeModule record);

    int updateByPrimaryKey(IworkResumeModule record);
}