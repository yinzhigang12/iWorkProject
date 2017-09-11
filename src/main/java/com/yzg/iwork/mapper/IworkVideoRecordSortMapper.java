package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkVideoRecordSort;
import com.yzg.iwork.pojo.IworkVideoRecordSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkVideoRecordSortMapper {
    long countByExample(IworkVideoRecordSortExample example);

    int deleteByExample(IworkVideoRecordSortExample example);

    int deleteByPrimaryKey(Integer videorecordsortid);

    int insert(IworkVideoRecordSort record);

    int insertSelective(IworkVideoRecordSort record);

    List<IworkVideoRecordSort> selectByExample(IworkVideoRecordSortExample example);

    IworkVideoRecordSort selectByPrimaryKey(Integer videorecordsortid);

    int updateByExampleSelective(@Param("record") IworkVideoRecordSort record, @Param("example") IworkVideoRecordSortExample example);

    int updateByExample(@Param("record") IworkVideoRecordSort record, @Param("example") IworkVideoRecordSortExample example);

    int updateByPrimaryKeySelective(IworkVideoRecordSort record);

    int updateByPrimaryKey(IworkVideoRecordSort record);
}