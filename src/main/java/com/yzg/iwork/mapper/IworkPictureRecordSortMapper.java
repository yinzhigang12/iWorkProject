package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkPictureRecordSort;
import com.yzg.iwork.pojo.IworkPictureRecordSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkPictureRecordSortMapper {
    long countByExample(IworkPictureRecordSortExample example);

    int deleteByExample(IworkPictureRecordSortExample example);

    int deleteByPrimaryKey(Integer picturerecordsortid);

    int insert(IworkPictureRecordSort record);

    int insertSelective(IworkPictureRecordSort record);

    List<IworkPictureRecordSort> selectByExample(IworkPictureRecordSortExample example);

    IworkPictureRecordSort selectByPrimaryKey(Integer picturerecordsortid);

    int updateByExampleSelective(@Param("record") IworkPictureRecordSort record, @Param("example") IworkPictureRecordSortExample example);

    int updateByExample(@Param("record") IworkPictureRecordSort record, @Param("example") IworkPictureRecordSortExample example);

    int updateByPrimaryKeySelective(IworkPictureRecordSort record);

    int updateByPrimaryKey(IworkPictureRecordSort record);
}