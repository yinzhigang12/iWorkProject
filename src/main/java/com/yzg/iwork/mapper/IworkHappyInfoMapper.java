package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkHappyInfo;
import com.yzg.iwork.pojo.IworkHappyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkHappyInfoMapper {
    long countByExample(IworkHappyInfoExample example);

    int deleteByExample(IworkHappyInfoExample example);

    int deleteByPrimaryKey(Integer happyinfoid);

    int insert(IworkHappyInfo record);

    int insertSelective(IworkHappyInfo record);

    List<IworkHappyInfo> selectByExampleWithBLOBs(IworkHappyInfoExample example);

    List<IworkHappyInfo> selectByExample(IworkHappyInfoExample example);

    IworkHappyInfo selectByPrimaryKey(Integer happyinfoid);

    int updateByExampleSelective(@Param("record") IworkHappyInfo record, @Param("example") IworkHappyInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkHappyInfo record, @Param("example") IworkHappyInfoExample example);

    int updateByExample(@Param("record") IworkHappyInfo record, @Param("example") IworkHappyInfoExample example);

    int updateByPrimaryKeySelective(IworkHappyInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkHappyInfo record);

    int updateByPrimaryKey(IworkHappyInfo record);
}