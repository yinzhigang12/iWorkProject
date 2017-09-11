package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBooksKey;
import com.yzg.iwork.pojo.IworkBooksKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBooksKeyMapper {
    long countByExample(IworkBooksKeyExample example);

    int deleteByExample(IworkBooksKeyExample example);

    int deleteByPrimaryKey(Integer bookskeyid);

    int insert(IworkBooksKey record);

    int insertSelective(IworkBooksKey record);

    List<IworkBooksKey> selectByExample(IworkBooksKeyExample example);

    IworkBooksKey selectByPrimaryKey(Integer bookskeyid);

    int updateByExampleSelective(@Param("record") IworkBooksKey record, @Param("example") IworkBooksKeyExample example);

    int updateByExample(@Param("record") IworkBooksKey record, @Param("example") IworkBooksKeyExample example);

    int updateByPrimaryKeySelective(IworkBooksKey record);

    int updateByPrimaryKey(IworkBooksKey record);
}