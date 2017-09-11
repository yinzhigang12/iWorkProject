package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBooksSource;
import com.yzg.iwork.pojo.IworkBooksSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBooksSourceMapper {
    long countByExample(IworkBooksSourceExample example);

    int deleteByExample(IworkBooksSourceExample example);

    int deleteByPrimaryKey(Integer bookssourceid);

    int insert(IworkBooksSource record);

    int insertSelective(IworkBooksSource record);

    List<IworkBooksSource> selectByExample(IworkBooksSourceExample example);

    IworkBooksSource selectByPrimaryKey(Integer bookssourceid);

    int updateByExampleSelective(@Param("record") IworkBooksSource record, @Param("example") IworkBooksSourceExample example);

    int updateByExample(@Param("record") IworkBooksSource record, @Param("example") IworkBooksSourceExample example);

    int updateByPrimaryKeySelective(IworkBooksSource record);

    int updateByPrimaryKey(IworkBooksSource record);
}