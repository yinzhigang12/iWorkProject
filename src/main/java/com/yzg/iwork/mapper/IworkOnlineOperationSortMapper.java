package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkOnlineOperationSort;
import com.yzg.iwork.pojo.IworkOnlineOperationSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkOnlineOperationSortMapper {
    long countByExample(IworkOnlineOperationSortExample example);

    int deleteByExample(IworkOnlineOperationSortExample example);

    int deleteByPrimaryKey(Integer onlineoperationsortid);

    int insert(IworkOnlineOperationSort record);

    int insertSelective(IworkOnlineOperationSort record);

    List<IworkOnlineOperationSort> selectByExample(IworkOnlineOperationSortExample example);

    IworkOnlineOperationSort selectByPrimaryKey(Integer onlineoperationsortid);

    int updateByExampleSelective(@Param("record") IworkOnlineOperationSort record, @Param("example") IworkOnlineOperationSortExample example);

    int updateByExample(@Param("record") IworkOnlineOperationSort record, @Param("example") IworkOnlineOperationSortExample example);

    int updateByPrimaryKeySelective(IworkOnlineOperationSort record);

    int updateByPrimaryKey(IworkOnlineOperationSort record);
}