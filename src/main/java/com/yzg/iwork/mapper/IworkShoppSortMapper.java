package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkShoppSort;
import com.yzg.iwork.pojo.IworkShoppSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkShoppSortMapper {
    long countByExample(IworkShoppSortExample example);

    int deleteByExample(IworkShoppSortExample example);

    int deleteByPrimaryKey(Integer shoppsortid);

    int insert(IworkShoppSort record);

    int insertSelective(IworkShoppSort record);

    List<IworkShoppSort> selectByExample(IworkShoppSortExample example);

    IworkShoppSort selectByPrimaryKey(Integer shoppsortid);

    int updateByExampleSelective(@Param("record") IworkShoppSort record, @Param("example") IworkShoppSortExample example);

    int updateByExample(@Param("record") IworkShoppSort record, @Param("example") IworkShoppSortExample example);

    int updateByPrimaryKeySelective(IworkShoppSort record);

    int updateByPrimaryKey(IworkShoppSort record);
}