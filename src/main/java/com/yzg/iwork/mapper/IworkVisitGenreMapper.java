package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkVisitGenre;
import com.yzg.iwork.pojo.IworkVisitGenreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkVisitGenreMapper {
    long countByExample(IworkVisitGenreExample example);

    int deleteByExample(IworkVisitGenreExample example);

    int deleteByPrimaryKey(Integer visitgenreid);

    int insert(IworkVisitGenre record);

    int insertSelective(IworkVisitGenre record);

    List<IworkVisitGenre> selectByExample(IworkVisitGenreExample example);

    IworkVisitGenre selectByPrimaryKey(Integer visitgenreid);

    int updateByExampleSelective(@Param("record") IworkVisitGenre record, @Param("example") IworkVisitGenreExample example);

    int updateByExample(@Param("record") IworkVisitGenre record, @Param("example") IworkVisitGenreExample example);

    int updateByPrimaryKeySelective(IworkVisitGenre record);

    int updateByPrimaryKey(IworkVisitGenre record);
}