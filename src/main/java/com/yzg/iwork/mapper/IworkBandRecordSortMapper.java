package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBandRecordSort;
import com.yzg.iwork.pojo.IworkBandRecordSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBandRecordSortMapper {
    long countByExample(IworkBandRecordSortExample example);

    int deleteByExample(IworkBandRecordSortExample example);

    int deleteByPrimaryKey(Integer bandrecordsortid);

    int insert(IworkBandRecordSort record);

    int insertSelective(IworkBandRecordSort record);

    List<IworkBandRecordSort> selectByExample(IworkBandRecordSortExample example);

    IworkBandRecordSort selectByPrimaryKey(Integer bandrecordsortid);

    int updateByExampleSelective(@Param("record") IworkBandRecordSort record, @Param("example") IworkBandRecordSortExample example);

    int updateByExample(@Param("record") IworkBandRecordSort record, @Param("example") IworkBandRecordSortExample example);

    int updateByPrimaryKeySelective(IworkBandRecordSort record);

    int updateByPrimaryKey(IworkBandRecordSort record);
}