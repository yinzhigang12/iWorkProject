package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkHappySort;
import com.yzg.iwork.pojo.IworkHappySortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkHappySortMapper {
    long countByExample(IworkHappySortExample example);

    int deleteByExample(IworkHappySortExample example);

    int deleteByPrimaryKey(Integer happysortid);

    int insert(IworkHappySort record);

    int insertSelective(IworkHappySort record);

    List<IworkHappySort> selectByExample(IworkHappySortExample example);

    IworkHappySort selectByPrimaryKey(Integer happysortid);

    int updateByExampleSelective(@Param("record") IworkHappySort record, @Param("example") IworkHappySortExample example);

    int updateByExample(@Param("record") IworkHappySort record, @Param("example") IworkHappySortExample example);

    int updateByPrimaryKeySelective(IworkHappySort record);

    int updateByPrimaryKey(IworkHappySort record);
}