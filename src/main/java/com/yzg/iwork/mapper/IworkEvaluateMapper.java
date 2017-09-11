package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkEvaluate;
import com.yzg.iwork.pojo.IworkEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkEvaluateMapper {
    long countByExample(IworkEvaluateExample example);

    int deleteByExample(IworkEvaluateExample example);

    int deleteByPrimaryKey(Integer evaluateid);

    int insert(IworkEvaluate record);

    int insertSelective(IworkEvaluate record);

    List<IworkEvaluate> selectByExampleWithBLOBs(IworkEvaluateExample example);

    List<IworkEvaluate> selectByExample(IworkEvaluateExample example);

    IworkEvaluate selectByPrimaryKey(Integer evaluateid);

    int updateByExampleSelective(@Param("record") IworkEvaluate record, @Param("example") IworkEvaluateExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkEvaluate record, @Param("example") IworkEvaluateExample example);

    int updateByExample(@Param("record") IworkEvaluate record, @Param("example") IworkEvaluateExample example);

    int updateByPrimaryKeySelective(IworkEvaluate record);

    int updateByPrimaryKeyWithBLOBs(IworkEvaluate record);

    int updateByPrimaryKey(IworkEvaluate record);
}