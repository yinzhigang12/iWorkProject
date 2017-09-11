package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkOnlineResourceInfo;
import com.yzg.iwork.pojo.IworkOnlineResourceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkOnlineResourceInfoMapper {
    long countByExample(IworkOnlineResourceInfoExample example);

    int deleteByExample(IworkOnlineResourceInfoExample example);

    int deleteByPrimaryKey(Integer onlineresourceinfoid);

    int insert(IworkOnlineResourceInfo record);

    int insertSelective(IworkOnlineResourceInfo record);

    List<IworkOnlineResourceInfo> selectByExample(IworkOnlineResourceInfoExample example);

    IworkOnlineResourceInfo selectByPrimaryKey(Integer onlineresourceinfoid);

    int updateByExampleSelective(@Param("record") IworkOnlineResourceInfo record, @Param("example") IworkOnlineResourceInfoExample example);

    int updateByExample(@Param("record") IworkOnlineResourceInfo record, @Param("example") IworkOnlineResourceInfoExample example);

    int updateByPrimaryKeySelective(IworkOnlineResourceInfo record);

    int updateByPrimaryKey(IworkOnlineResourceInfo record);
}