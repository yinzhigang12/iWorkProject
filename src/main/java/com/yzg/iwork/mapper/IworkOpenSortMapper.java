package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkOpenSort;
import com.yzg.iwork.pojo.IworkOpenSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkOpenSortMapper {
    long countByExample(IworkOpenSortExample example);

    int deleteByExample(IworkOpenSortExample example);

    int deleteByPrimaryKey(Integer opensortid);

    int insert(IworkOpenSort record);

    int insertSelective(IworkOpenSort record);

    List<IworkOpenSort> selectByExample(IworkOpenSortExample example);

    IworkOpenSort selectByPrimaryKey(Integer opensortid);

    int updateByExampleSelective(@Param("record") IworkOpenSort record, @Param("example") IworkOpenSortExample example);

    int updateByExample(@Param("record") IworkOpenSort record, @Param("example") IworkOpenSortExample example);

    int updateByPrimaryKeySelective(IworkOpenSort record);

    int updateByPrimaryKey(IworkOpenSort record);
}