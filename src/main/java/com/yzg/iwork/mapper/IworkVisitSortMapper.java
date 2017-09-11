package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkVisitSort;
import com.yzg.iwork.pojo.IworkVisitSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkVisitSortMapper {
    long countByExample(IworkVisitSortExample example);

    int deleteByExample(IworkVisitSortExample example);

    int deleteByPrimaryKey(Integer visitsortid);

    int insert(IworkVisitSort record);

    int insertSelective(IworkVisitSort record);

    List<IworkVisitSort> selectByExample(IworkVisitSortExample example);

    IworkVisitSort selectByPrimaryKey(Integer visitsortid);

    int updateByExampleSelective(@Param("record") IworkVisitSort record, @Param("example") IworkVisitSortExample example);

    int updateByExample(@Param("record") IworkVisitSort record, @Param("example") IworkVisitSortExample example);

    int updateByPrimaryKeySelective(IworkVisitSort record);

    int updateByPrimaryKey(IworkVisitSort record);
}