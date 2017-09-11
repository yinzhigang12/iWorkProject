package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkVideoRecordInfo;
import com.yzg.iwork.pojo.IworkVideoRecordInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkVideoRecordInfoMapper {
    long countByExample(IworkVideoRecordInfoExample example);

    int deleteByExample(IworkVideoRecordInfoExample example);

    int deleteByPrimaryKey(Integer videorecordinfoid);

    int insert(IworkVideoRecordInfo record);

    int insertSelective(IworkVideoRecordInfo record);

    List<IworkVideoRecordInfo> selectByExample(IworkVideoRecordInfoExample example);

    IworkVideoRecordInfo selectByPrimaryKey(Integer videorecordinfoid);

    int updateByExampleSelective(@Param("record") IworkVideoRecordInfo record, @Param("example") IworkVideoRecordInfoExample example);

    int updateByExample(@Param("record") IworkVideoRecordInfo record, @Param("example") IworkVideoRecordInfoExample example);

    int updateByPrimaryKeySelective(IworkVideoRecordInfo record);

    int updateByPrimaryKey(IworkVideoRecordInfo record);
}