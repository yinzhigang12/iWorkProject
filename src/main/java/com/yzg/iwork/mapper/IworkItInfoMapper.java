package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkItInfo;
import com.yzg.iwork.pojo.IworkItInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkItInfoMapper {
    long countByExample(IworkItInfoExample example);

    int deleteByExample(IworkItInfoExample example);

    int deleteByPrimaryKey(Integer itinfoid);

    int insert(IworkItInfo record);

    int insertSelective(IworkItInfo record);

    List<IworkItInfo> selectByExample(IworkItInfoExample example);

    IworkItInfo selectByPrimaryKey(Integer itinfoid);

    int updateByExampleSelective(@Param("record") IworkItInfo record, @Param("example") IworkItInfoExample example);

    int updateByExample(@Param("record") IworkItInfo record, @Param("example") IworkItInfoExample example);

    int updateByPrimaryKeySelective(IworkItInfo record);

    int updateByPrimaryKey(IworkItInfo record);
}