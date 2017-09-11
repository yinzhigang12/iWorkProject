package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkRecordSort;
import com.yzg.iwork.pojo.IworkRecordSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkRecordSortMapper {
    long countByExample(IworkRecordSortExample example);

    int deleteByExample(IworkRecordSortExample example);

    int deleteByPrimaryKey(Integer recordsortid);

    int insert(IworkRecordSort record);

    int insertSelective(IworkRecordSort record);

    List<IworkRecordSort> selectByExample(IworkRecordSortExample example);

    IworkRecordSort selectByPrimaryKey(Integer recordsortid);

    int updateByExampleSelective(@Param("record") IworkRecordSort record, @Param("example") IworkRecordSortExample example);

    int updateByExample(@Param("record") IworkRecordSort record, @Param("example") IworkRecordSortExample example);

    int updateByPrimaryKeySelective(IworkRecordSort record);

    int updateByPrimaryKey(IworkRecordSort record);
}