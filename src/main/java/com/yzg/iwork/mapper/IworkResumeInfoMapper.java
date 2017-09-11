package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkResumeInfo;
import com.yzg.iwork.pojo.IworkResumeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkResumeInfoMapper {
    long countByExample(IworkResumeInfoExample example);

    int deleteByExample(IworkResumeInfoExample example);

    int deleteByPrimaryKey(Integer resumeinfoid);

    int insert(IworkResumeInfo record);

    int insertSelective(IworkResumeInfo record);

    List<IworkResumeInfo> selectByExampleWithBLOBs(IworkResumeInfoExample example);

    List<IworkResumeInfo> selectByExample(IworkResumeInfoExample example);

    IworkResumeInfo selectByPrimaryKey(Integer resumeinfoid);

    int updateByExampleSelective(@Param("record") IworkResumeInfo record, @Param("example") IworkResumeInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkResumeInfo record, @Param("example") IworkResumeInfoExample example);

    int updateByExample(@Param("record") IworkResumeInfo record, @Param("example") IworkResumeInfoExample example);

    int updateByPrimaryKeySelective(IworkResumeInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkResumeInfo record);

    int updateByPrimaryKey(IworkResumeInfo record);
}