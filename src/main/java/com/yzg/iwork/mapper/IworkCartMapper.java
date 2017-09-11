package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkCart;
import com.yzg.iwork.pojo.IworkCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkCartMapper {
    long countByExample(IworkCartExample example);

    int deleteByExample(IworkCartExample example);

    int deleteByPrimaryKey(Integer cartid);

    int insert(IworkCart record);

    int insertSelective(IworkCart record);

    List<IworkCart> selectByExample(IworkCartExample example);

    IworkCart selectByPrimaryKey(Integer cartid);

    int updateByExampleSelective(@Param("record") IworkCart record, @Param("example") IworkCartExample example);

    int updateByExample(@Param("record") IworkCart record, @Param("example") IworkCartExample example);

    int updateByPrimaryKeySelective(IworkCart record);

    int updateByPrimaryKey(IworkCart record);
}