package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkVisitInfo;
import com.yzg.iwork.pojo.IworkVisitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkVisitInfoMapper {
    long countByExample(IworkVisitInfoExample example);

    int deleteByExample(IworkVisitInfoExample example);

    int deleteByPrimaryKey(Integer visitinfoid);

    int insert(IworkVisitInfo record);

    int insertSelective(IworkVisitInfo record);

    List<IworkVisitInfo> selectByExampleWithBLOBs(IworkVisitInfoExample example);

    List<IworkVisitInfo> selectByExample(IworkVisitInfoExample example);

    IworkVisitInfo selectByPrimaryKey(Integer visitinfoid);

    int updateByExampleSelective(@Param("record") IworkVisitInfo record, @Param("example") IworkVisitInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkVisitInfo record, @Param("example") IworkVisitInfoExample example);

    int updateByExample(@Param("record") IworkVisitInfo record, @Param("example") IworkVisitInfoExample example);

    int updateByPrimaryKeySelective(IworkVisitInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkVisitInfo record);

    int updateByPrimaryKey(IworkVisitInfo record);
}