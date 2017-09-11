package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkHistoryInfo;
import com.yzg.iwork.pojo.IworkHistoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkHistoryInfoMapper {
    long countByExample(IworkHistoryInfoExample example);

    int deleteByExample(IworkHistoryInfoExample example);

    int deleteByPrimaryKey(Integer historyinfoid);

    int insert(IworkHistoryInfo record);

    int insertSelective(IworkHistoryInfo record);

    List<IworkHistoryInfo> selectByExampleWithBLOBs(IworkHistoryInfoExample example);

    List<IworkHistoryInfo> selectByExample(IworkHistoryInfoExample example);

    IworkHistoryInfo selectByPrimaryKey(Integer historyinfoid);

    int updateByExampleSelective(@Param("record") IworkHistoryInfo record, @Param("example") IworkHistoryInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkHistoryInfo record, @Param("example") IworkHistoryInfoExample example);

    int updateByExample(@Param("record") IworkHistoryInfo record, @Param("example") IworkHistoryInfoExample example);

    int updateByPrimaryKeySelective(IworkHistoryInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkHistoryInfo record);

    int updateByPrimaryKey(IworkHistoryInfo record);
}