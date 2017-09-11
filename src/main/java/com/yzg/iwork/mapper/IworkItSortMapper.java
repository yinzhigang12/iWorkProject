package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkItSort;
import com.yzg.iwork.pojo.IworkItSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkItSortMapper {
    long countByExample(IworkItSortExample example);

    int deleteByExample(IworkItSortExample example);

    int deleteByPrimaryKey(Integer itsortid);

    int insert(IworkItSort record);

    int insertSelective(IworkItSort record);

    List<IworkItSort> selectByExample(IworkItSortExample example);

    IworkItSort selectByPrimaryKey(Integer itsortid);

    int updateByExampleSelective(@Param("record") IworkItSort record, @Param("example") IworkItSortExample example);

    int updateByExample(@Param("record") IworkItSort record, @Param("example") IworkItSortExample example);

    int updateByPrimaryKeySelective(IworkItSort record);

    int updateByPrimaryKey(IworkItSort record);
}