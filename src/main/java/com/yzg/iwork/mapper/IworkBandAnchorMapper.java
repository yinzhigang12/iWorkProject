package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBandAnchor;
import com.yzg.iwork.pojo.IworkBandAnchorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBandAnchorMapper {
    long countByExample(IworkBandAnchorExample example);

    int deleteByExample(IworkBandAnchorExample example);

    int deleteByPrimaryKey(Integer bandanchorid);

    int insert(IworkBandAnchor record);

    int insertSelective(IworkBandAnchor record);

    List<IworkBandAnchor> selectByExampleWithBLOBs(IworkBandAnchorExample example);

    List<IworkBandAnchor> selectByExample(IworkBandAnchorExample example);

    IworkBandAnchor selectByPrimaryKey(Integer bandanchorid);

    int updateByExampleSelective(@Param("record") IworkBandAnchor record, @Param("example") IworkBandAnchorExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkBandAnchor record, @Param("example") IworkBandAnchorExample example);

    int updateByExample(@Param("record") IworkBandAnchor record, @Param("example") IworkBandAnchorExample example);

    int updateByPrimaryKeySelective(IworkBandAnchor record);

    int updateByPrimaryKeyWithBLOBs(IworkBandAnchor record);

    int updateByPrimaryKey(IworkBandAnchor record);
}