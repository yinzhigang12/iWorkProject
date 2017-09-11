package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkListenListInfo;
import com.yzg.iwork.pojo.IworkListenListInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkListenListInfoMapper {
    long countByExample(IworkListenListInfoExample example);

    int deleteByExample(IworkListenListInfoExample example);

    int deleteByPrimaryKey(Integer listenlistinfoid);

    int insert(IworkListenListInfo record);

    int insertSelective(IworkListenListInfo record);

    List<IworkListenListInfo> selectByExample(IworkListenListInfoExample example);

    IworkListenListInfo selectByPrimaryKey(Integer listenlistinfoid);

    int updateByExampleSelective(@Param("record") IworkListenListInfo record, @Param("example") IworkListenListInfoExample example);

    int updateByExample(@Param("record") IworkListenListInfo record, @Param("example") IworkListenListInfoExample example);

    int updateByPrimaryKeySelective(IworkListenListInfo record);

    int updateByPrimaryKey(IworkListenListInfo record);
}