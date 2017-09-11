package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkOnlineResourceSort;
import com.yzg.iwork.pojo.IworkOnlineResourceSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkOnlineResourceSortMapper {
    long countByExample(IworkOnlineResourceSortExample example);

    int deleteByExample(IworkOnlineResourceSortExample example);

    int deleteByPrimaryKey(Integer onlineresourcesortid);

    int insert(IworkOnlineResourceSort record);

    int insertSelective(IworkOnlineResourceSort record);

    List<IworkOnlineResourceSort> selectByExample(IworkOnlineResourceSortExample example);

    IworkOnlineResourceSort selectByPrimaryKey(Integer onlineresourcesortid);

    int updateByExampleSelective(@Param("record") IworkOnlineResourceSort record, @Param("example") IworkOnlineResourceSortExample example);

    int updateByExample(@Param("record") IworkOnlineResourceSort record, @Param("example") IworkOnlineResourceSortExample example);

    int updateByPrimaryKeySelective(IworkOnlineResourceSort record);

    int updateByPrimaryKey(IworkOnlineResourceSort record);
}