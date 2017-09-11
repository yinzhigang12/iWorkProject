package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkHistorySort;
import com.yzg.iwork.pojo.IworkHistorySortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkHistorySortMapper {
    long countByExample(IworkHistorySortExample example);

    int deleteByExample(IworkHistorySortExample example);

    int deleteByPrimaryKey(Integer historysortid);

    int insert(IworkHistorySort record);

    int insertSelective(IworkHistorySort record);

    List<IworkHistorySort> selectByExample(IworkHistorySortExample example);

    IworkHistorySort selectByPrimaryKey(Integer historysortid);

    int updateByExampleSelective(@Param("record") IworkHistorySort record, @Param("example") IworkHistorySortExample example);

    int updateByExample(@Param("record") IworkHistorySort record, @Param("example") IworkHistorySortExample example);

    int updateByPrimaryKeySelective(IworkHistorySort record);

    int updateByPrimaryKey(IworkHistorySort record);
}