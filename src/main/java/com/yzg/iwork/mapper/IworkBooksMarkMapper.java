package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBooksMark;
import com.yzg.iwork.pojo.IworkBooksMarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBooksMarkMapper {
    long countByExample(IworkBooksMarkExample example);

    int deleteByExample(IworkBooksMarkExample example);

    int deleteByPrimaryKey(Integer booksmarkid);

    int insert(IworkBooksMark record);

    int insertSelective(IworkBooksMark record);

    List<IworkBooksMark> selectByExample(IworkBooksMarkExample example);

    IworkBooksMark selectByPrimaryKey(Integer booksmarkid);

    int updateByExampleSelective(@Param("record") IworkBooksMark record, @Param("example") IworkBooksMarkExample example);

    int updateByExample(@Param("record") IworkBooksMark record, @Param("example") IworkBooksMarkExample example);

    int updateByPrimaryKeySelective(IworkBooksMark record);

    int updateByPrimaryKey(IworkBooksMark record);
}