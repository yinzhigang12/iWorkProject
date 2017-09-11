package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkListenListSort;
import com.yzg.iwork.pojo.IworkListenListSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkListenListSortMapper {
    long countByExample(IworkListenListSortExample example);

    int deleteByExample(IworkListenListSortExample example);

    int deleteByPrimaryKey(Integer listenlistsortid);

    int insert(IworkListenListSort record);

    int insertSelective(IworkListenListSort record);

    List<IworkListenListSort> selectByExample(IworkListenListSortExample example);

    IworkListenListSort selectByPrimaryKey(Integer listenlistsortid);

    int updateByExampleSelective(@Param("record") IworkListenListSort record, @Param("example") IworkListenListSortExample example);

    int updateByExample(@Param("record") IworkListenListSort record, @Param("example") IworkListenListSortExample example);

    int updateByPrimaryKeySelective(IworkListenListSort record);

    int updateByPrimaryKey(IworkListenListSort record);
}