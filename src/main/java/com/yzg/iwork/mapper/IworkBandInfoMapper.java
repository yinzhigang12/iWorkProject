package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBandInfo;
import com.yzg.iwork.pojo.IworkBandInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBandInfoMapper {
    long countByExample(IworkBandInfoExample example);

    int deleteByExample(IworkBandInfoExample example);

    int deleteByPrimaryKey(Integer bandinfoid);

    int insert(IworkBandInfo record);

    int insertSelective(IworkBandInfo record);

    List<IworkBandInfo> selectByExampleWithBLOBs(IworkBandInfoExample example);

    List<IworkBandInfo> selectByExample(IworkBandInfoExample example);

    IworkBandInfo selectByPrimaryKey(Integer bandinfoid);

    int updateByExampleSelective(@Param("record") IworkBandInfo record, @Param("example") IworkBandInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkBandInfo record, @Param("example") IworkBandInfoExample example);

    int updateByExample(@Param("record") IworkBandInfo record, @Param("example") IworkBandInfoExample example);

    int updateByPrimaryKeySelective(IworkBandInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkBandInfo record);

    int updateByPrimaryKey(IworkBandInfo record);
}