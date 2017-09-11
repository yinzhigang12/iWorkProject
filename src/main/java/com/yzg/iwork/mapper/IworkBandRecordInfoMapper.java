package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBandRecordInfo;
import com.yzg.iwork.pojo.IworkBandRecordInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBandRecordInfoMapper {
    long countByExample(IworkBandRecordInfoExample example);

    int deleteByExample(IworkBandRecordInfoExample example);

    int deleteByPrimaryKey(Integer bandrecordinfoid);

    int insert(IworkBandRecordInfo record);

    int insertSelective(IworkBandRecordInfo record);

    List<IworkBandRecordInfo> selectByExample(IworkBandRecordInfoExample example);

    IworkBandRecordInfo selectByPrimaryKey(Integer bandrecordinfoid);

    int updateByExampleSelective(@Param("record") IworkBandRecordInfo record, @Param("example") IworkBandRecordInfoExample example);

    int updateByExample(@Param("record") IworkBandRecordInfo record, @Param("example") IworkBandRecordInfoExample example);

    int updateByPrimaryKeySelective(IworkBandRecordInfo record);

    int updateByPrimaryKey(IworkBandRecordInfo record);
}