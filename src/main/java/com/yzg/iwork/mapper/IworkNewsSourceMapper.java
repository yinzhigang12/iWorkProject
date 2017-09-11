package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkNewsSource;
import com.yzg.iwork.pojo.IworkNewsSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkNewsSourceMapper {
    long countByExample(IworkNewsSourceExample example);

    int deleteByExample(IworkNewsSourceExample example);

    int deleteByPrimaryKey(Integer newsourceid);

    int insert(IworkNewsSource record);

    int insertSelective(IworkNewsSource record);

    List<IworkNewsSource> selectByExample(IworkNewsSourceExample example);

    IworkNewsSource selectByPrimaryKey(Integer newsourceid);

    int updateByExampleSelective(@Param("record") IworkNewsSource record, @Param("example") IworkNewsSourceExample example);

    int updateByExample(@Param("record") IworkNewsSource record, @Param("example") IworkNewsSourceExample example);

    int updateByPrimaryKeySelective(IworkNewsSource record);

    int updateByPrimaryKey(IworkNewsSource record);
}