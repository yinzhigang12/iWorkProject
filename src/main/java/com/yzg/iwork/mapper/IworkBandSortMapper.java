package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBandSort;
import com.yzg.iwork.pojo.IworkBandSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBandSortMapper {
    long countByExample(IworkBandSortExample example);

    int deleteByExample(IworkBandSortExample example);

    int deleteByPrimaryKey(Integer bandsortid);

    int insert(IworkBandSort record);

    int insertSelective(IworkBandSort record);

    List<IworkBandSort> selectByExample(IworkBandSortExample example);

    IworkBandSort selectByPrimaryKey(Integer bandsortid);

    int updateByExampleSelective(@Param("record") IworkBandSort record, @Param("example") IworkBandSortExample example);

    int updateByExample(@Param("record") IworkBandSort record, @Param("example") IworkBandSortExample example);

    int updateByPrimaryKeySelective(IworkBandSort record);

    int updateByPrimaryKey(IworkBandSort record);
}