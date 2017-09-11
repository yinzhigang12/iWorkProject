package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkOnlineRecordSort;
import com.yzg.iwork.pojo.IworkOnlineRecordSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkOnlineRecordSortMapper {
    long countByExample(IworkOnlineRecordSortExample example);

    int deleteByExample(IworkOnlineRecordSortExample example);

    int deleteByPrimaryKey(Integer onlinerecordsortid);

    int insert(IworkOnlineRecordSort record);

    int insertSelective(IworkOnlineRecordSort record);

    List<IworkOnlineRecordSort> selectByExample(IworkOnlineRecordSortExample example);

    IworkOnlineRecordSort selectByPrimaryKey(Integer onlinerecordsortid);

    int updateByExampleSelective(@Param("record") IworkOnlineRecordSort record, @Param("example") IworkOnlineRecordSortExample example);

    int updateByExample(@Param("record") IworkOnlineRecordSort record, @Param("example") IworkOnlineRecordSortExample example);

    int updateByPrimaryKeySelective(IworkOnlineRecordSort record);

    int updateByPrimaryKey(IworkOnlineRecordSort record);
}