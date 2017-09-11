package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkVideoInfo;
import com.yzg.iwork.pojo.IworkVideoInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkVideoInfoMapper {
    long countByExample(IworkVideoInfoExample example);

    int deleteByExample(IworkVideoInfoExample example);

    int deleteByPrimaryKey(Integer videoinfoid);

    int insert(IworkVideoInfo record);

    int insertSelective(IworkVideoInfo record);

    List<IworkVideoInfo> selectByExampleWithBLOBs(IworkVideoInfoExample example);

    List<IworkVideoInfo> selectByExample(IworkVideoInfoExample example);

    IworkVideoInfo selectByPrimaryKey(Integer videoinfoid);

    int updateByExampleSelective(@Param("record") IworkVideoInfo record, @Param("example") IworkVideoInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkVideoInfo record, @Param("example") IworkVideoInfoExample example);

    int updateByExample(@Param("record") IworkVideoInfo record, @Param("example") IworkVideoInfoExample example);

    int updateByPrimaryKeySelective(IworkVideoInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkVideoInfo record);

    int updateByPrimaryKey(IworkVideoInfo record);
}