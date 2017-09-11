package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkBooksSort;
import com.yzg.iwork.pojo.IworkBooksSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkBooksSortMapper {
    long countByExample(IworkBooksSortExample example);

    int deleteByExample(IworkBooksSortExample example);

    int deleteByPrimaryKey(Integer bookssortid);

    int insert(IworkBooksSort record);

    int insertSelective(IworkBooksSort record);

    List<IworkBooksSort> selectByExample(IworkBooksSortExample example);

    IworkBooksSort selectByPrimaryKey(Integer bookssortid);

    int updateByExampleSelective(@Param("record") IworkBooksSort record, @Param("example") IworkBooksSortExample example);

    int updateByExample(@Param("record") IworkBooksSort record, @Param("example") IworkBooksSortExample example);

    int updateByPrimaryKeySelective(IworkBooksSort record);

    int updateByPrimaryKey(IworkBooksSort record);
}