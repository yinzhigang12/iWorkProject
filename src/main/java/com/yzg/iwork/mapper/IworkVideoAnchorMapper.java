package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkVideoAnchor;
import com.yzg.iwork.pojo.IworkVideoAnchorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkVideoAnchorMapper {
    long countByExample(IworkVideoAnchorExample example);

    int deleteByExample(IworkVideoAnchorExample example);

    int deleteByPrimaryKey(Integer videoanchorid);

    int insert(IworkVideoAnchor record);

    int insertSelective(IworkVideoAnchor record);

    List<IworkVideoAnchor> selectByExampleWithBLOBs(IworkVideoAnchorExample example);

    List<IworkVideoAnchor> selectByExample(IworkVideoAnchorExample example);

    IworkVideoAnchor selectByPrimaryKey(Integer videoanchorid);

    int updateByExampleSelective(@Param("record") IworkVideoAnchor record, @Param("example") IworkVideoAnchorExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkVideoAnchor record, @Param("example") IworkVideoAnchorExample example);

    int updateByExample(@Param("record") IworkVideoAnchor record, @Param("example") IworkVideoAnchorExample example);

    int updateByPrimaryKeySelective(IworkVideoAnchor record);

    int updateByPrimaryKeyWithBLOBs(IworkVideoAnchor record);

    int updateByPrimaryKey(IworkVideoAnchor record);
}