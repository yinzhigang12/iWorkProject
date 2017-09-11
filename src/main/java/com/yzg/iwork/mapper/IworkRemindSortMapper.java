package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkRemindSort;
import com.yzg.iwork.pojo.IworkRemindSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkRemindSortMapper {
    long countByExample(IworkRemindSortExample example);

    int deleteByExample(IworkRemindSortExample example);

    int deleteByPrimaryKey(Integer remindsortid);

    int insert(IworkRemindSort record);

    int insertSelective(IworkRemindSort record);

    List<IworkRemindSort> selectByExample(IworkRemindSortExample example);

    IworkRemindSort selectByPrimaryKey(Integer remindsortid);

    int updateByExampleSelective(@Param("record") IworkRemindSort record, @Param("example") IworkRemindSortExample example);

    int updateByExample(@Param("record") IworkRemindSort record, @Param("example") IworkRemindSortExample example);

    int updateByPrimaryKeySelective(IworkRemindSort record);

    int updateByPrimaryKey(IworkRemindSort record);
}