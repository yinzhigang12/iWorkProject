package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkVideoSort;
import com.yzg.iwork.pojo.IworkVideoSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkVideoSortMapper {
    long countByExample(IworkVideoSortExample example);

    int deleteByExample(IworkVideoSortExample example);

    int deleteByPrimaryKey(Integer videosortid);

    int insert(IworkVideoSort record);

    int insertSelective(IworkVideoSort record);

    List<IworkVideoSort> selectByExample(IworkVideoSortExample example);

    IworkVideoSort selectByPrimaryKey(Integer videosortid);

    int updateByExampleSelective(@Param("record") IworkVideoSort record, @Param("example") IworkVideoSortExample example);

    int updateByExample(@Param("record") IworkVideoSort record, @Param("example") IworkVideoSortExample example);

    int updateByPrimaryKeySelective(IworkVideoSort record);

    int updateByPrimaryKey(IworkVideoSort record);
}