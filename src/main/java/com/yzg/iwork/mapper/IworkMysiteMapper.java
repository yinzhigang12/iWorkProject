package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkMysite;
import com.yzg.iwork.pojo.IworkMysiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkMysiteMapper {
    long countByExample(IworkMysiteExample example);

    int deleteByExample(IworkMysiteExample example);

    int deleteByPrimaryKey(Integer mysiteid);

    int insert(IworkMysite record);

    int insertSelective(IworkMysite record);

    List<IworkMysite> selectByExample(IworkMysiteExample example);

    IworkMysite selectByPrimaryKey(Integer mysiteid);

    int updateByExampleSelective(@Param("record") IworkMysite record, @Param("example") IworkMysiteExample example);

    int updateByExample(@Param("record") IworkMysite record, @Param("example") IworkMysiteExample example);

    int updateByPrimaryKeySelective(IworkMysite record);

    int updateByPrimaryKey(IworkMysite record);
}