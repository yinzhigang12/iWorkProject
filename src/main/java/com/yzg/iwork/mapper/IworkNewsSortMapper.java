package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkNewsSort;
import com.yzg.iwork.pojo.IworkNewsSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkNewsSortMapper {
    long countByExample(IworkNewsSortExample example);

    int deleteByExample(IworkNewsSortExample example);

    int deleteByPrimaryKey(Integer newsortid);

    int insert(IworkNewsSort record);

    int insertSelective(IworkNewsSort record);

    List<IworkNewsSort> selectByExample(IworkNewsSortExample example);

    IworkNewsSort selectByPrimaryKey(Integer newsortid);

    int updateByExampleSelective(@Param("record") IworkNewsSort record, @Param("example") IworkNewsSortExample example);

    int updateByExample(@Param("record") IworkNewsSort record, @Param("example") IworkNewsSortExample example);

    int updateByPrimaryKeySelective(IworkNewsSort record);

    int updateByPrimaryKey(IworkNewsSort record);
}