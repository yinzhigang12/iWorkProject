package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkWebsiteSort;
import com.yzg.iwork.pojo.IworkWebsiteSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkWebsiteSortMapper {
    long countByExample(IworkWebsiteSortExample example);

    int deleteByExample(IworkWebsiteSortExample example);

    int deleteByPrimaryKey(Integer websitesortid);

    int insert(IworkWebsiteSort record);

    int insertSelective(IworkWebsiteSort record);

    List<IworkWebsiteSort> selectByExample(IworkWebsiteSortExample example);

    IworkWebsiteSort selectByPrimaryKey(Integer websitesortid);

    int updateByExampleSelective(@Param("record") IworkWebsiteSort record, @Param("example") IworkWebsiteSortExample example);

    int updateByExample(@Param("record") IworkWebsiteSort record, @Param("example") IworkWebsiteSortExample example);

    int updateByPrimaryKeySelective(IworkWebsiteSort record);

    int updateByPrimaryKey(IworkWebsiteSort record);
}