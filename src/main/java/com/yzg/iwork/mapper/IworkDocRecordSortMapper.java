package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkDocRecordSort;
import com.yzg.iwork.pojo.IworkDocRecordSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkDocRecordSortMapper {
    long countByExample(IworkDocRecordSortExample example);

    int deleteByExample(IworkDocRecordSortExample example);

    int deleteByPrimaryKey(Integer docrecordsortid);

    int insert(IworkDocRecordSort record);

    int insertSelective(IworkDocRecordSort record);

    List<IworkDocRecordSort> selectByExample(IworkDocRecordSortExample example);

    IworkDocRecordSort selectByPrimaryKey(Integer docrecordsortid);

    int updateByExampleSelective(@Param("record") IworkDocRecordSort record, @Param("example") IworkDocRecordSortExample example);

    int updateByExample(@Param("record") IworkDocRecordSort record, @Param("example") IworkDocRecordSortExample example);

    int updateByPrimaryKeySelective(IworkDocRecordSort record);

    int updateByPrimaryKey(IworkDocRecordSort record);
}