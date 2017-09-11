package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBooksInfo;
import com.yzg.iwork.pojo.IworkBooksInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBooksInfoMapper {
    long countByExample(IworkBooksInfoExample example);

    int deleteByExample(IworkBooksInfoExample example);

    int deleteByPrimaryKey(Integer booksinfoid);

    int insert(IworkBooksInfo record);

    int insertSelective(IworkBooksInfo record);

    List<IworkBooksInfo> selectByExampleWithBLOBs(IworkBooksInfoExample example);

    List<IworkBooksInfo> selectByExample(IworkBooksInfoExample example);

    IworkBooksInfo selectByPrimaryKey(Integer booksinfoid);

    int updateByExampleSelective(@Param("record") IworkBooksInfo record, @Param("example") IworkBooksInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IworkBooksInfo record, @Param("example") IworkBooksInfoExample example);

    int updateByExample(@Param("record") IworkBooksInfo record, @Param("example") IworkBooksInfoExample example);

    int updateByPrimaryKeySelective(IworkBooksInfo record);

    int updateByPrimaryKeyWithBLOBs(IworkBooksInfo record);

    int updateByPrimaryKey(IworkBooksInfo record);
}