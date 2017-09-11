package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkOnlineRecordInfo;
import com.yzg.iwork.pojo.IworkOnlineRecordInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkOnlineRecordInfoMapper {
    long countByExample(IworkOnlineRecordInfoExample example);

    int deleteByExample(IworkOnlineRecordInfoExample example);

    int deleteByPrimaryKey(Integer onlinerecordinfoid);

    int insert(IworkOnlineRecordInfo record);

    int insertSelective(IworkOnlineRecordInfo record);

    List<IworkOnlineRecordInfo> selectByExample(IworkOnlineRecordInfoExample example);

    IworkOnlineRecordInfo selectByPrimaryKey(Integer onlinerecordinfoid);

    int updateByExampleSelective(@Param("record") IworkOnlineRecordInfo record, @Param("example") IworkOnlineRecordInfoExample example);

    int updateByExample(@Param("record") IworkOnlineRecordInfo record, @Param("example") IworkOnlineRecordInfoExample example);

    int updateByPrimaryKeySelective(IworkOnlineRecordInfo record);

    int updateByPrimaryKey(IworkOnlineRecordInfo record);
}