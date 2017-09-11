package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkPictureRecordInfo;
import com.yzg.iwork.pojo.IworkPictureRecordInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkPictureRecordInfoMapper {
    long countByExample(IworkPictureRecordInfoExample example);

    int deleteByExample(IworkPictureRecordInfoExample example);

    int deleteByPrimaryKey(Integer picturerecordinfoid);

    int insert(IworkPictureRecordInfo record);

    int insertSelective(IworkPictureRecordInfo record);

    List<IworkPictureRecordInfo> selectByExample(IworkPictureRecordInfoExample example);

    IworkPictureRecordInfo selectByPrimaryKey(Integer picturerecordinfoid);

    int updateByExampleSelective(@Param("record") IworkPictureRecordInfo record, @Param("example") IworkPictureRecordInfoExample example);

    int updateByExample(@Param("record") IworkPictureRecordInfo record, @Param("example") IworkPictureRecordInfoExample example);

    int updateByPrimaryKeySelective(IworkPictureRecordInfo record);

    int updateByPrimaryKey(IworkPictureRecordInfo record);
}