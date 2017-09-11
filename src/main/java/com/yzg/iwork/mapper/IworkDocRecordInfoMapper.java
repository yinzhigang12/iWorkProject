package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkDocRecordInfo;
import com.yzg.iwork.pojo.IworkDocRecordInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkDocRecordInfoMapper {
    long countByExample(IworkDocRecordInfoExample example);

    int deleteByExample(IworkDocRecordInfoExample example);

    int deleteByPrimaryKey(Integer docrecordinfoid);

    int insert(IworkDocRecordInfo record);

    int insertSelective(IworkDocRecordInfo record);

    List<IworkDocRecordInfo> selectByExampleWithBLOBs(IworkDocRecordInfoExample example);

    List<IworkDocRecordInfo> selectByExample(IworkDocRecordInfoExample example);

    IworkDocRecordInfo selectByPrimaryKey(Integer docrecordinfoid);

    int updateByExampleSelective(@Param("record") IworkDocRecordInfo record, @Param("example") IworkDocRecordInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkDocRecordInfo record, @Param("example") IworkDocRecordInfoExample example);

    int updateByExample(@Param("record") IworkDocRecordInfo record, @Param("example") IworkDocRecordInfoExample example);

    int updateByPrimaryKeySelective(IworkDocRecordInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkDocRecordInfo record);

    int updateByPrimaryKey(IworkDocRecordInfo record);
}