package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkOnlineResourceSource;
import com.yzg.iwork.pojo.IworkOnlineResourceSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkOnlineResourceSourceMapper {
    long countByExample(IworkOnlineResourceSourceExample example);

    int deleteByExample(IworkOnlineResourceSourceExample example);

    int deleteByPrimaryKey(Integer onlineresourceid);

    int insert(IworkOnlineResourceSource record);

    int insertSelective(IworkOnlineResourceSource record);

    List<IworkOnlineResourceSource> selectByExample(IworkOnlineResourceSourceExample example);

    IworkOnlineResourceSource selectByPrimaryKey(Integer onlineresourceid);

    int updateByExampleSelective(@Param("record") IworkOnlineResourceSource record, @Param("example") IworkOnlineResourceSourceExample example);

    int updateByExample(@Param("record") IworkOnlineResourceSource record, @Param("example") IworkOnlineResourceSourceExample example);

    int updateByPrimaryKeySelective(IworkOnlineResourceSource record);

    int updateByPrimaryKey(IworkOnlineResourceSource record);
}