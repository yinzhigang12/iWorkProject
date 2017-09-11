package com.yzg.iwork.mapper;

import com.yzg.iwork.pojo.IworkUser;
import com.yzg.iwork.pojo.IworkUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IworkUserMapper {
    long countByExample(IworkUserExample example);

    int deleteByExample(IworkUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(IworkUser record);

    int insertSelective(IworkUser record);

    List<IworkUser> selectByExample(IworkUserExample example);

    IworkUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") IworkUser record, @Param("example") IworkUserExample example);

    int updateByExample(@Param("record") IworkUser record, @Param("example") IworkUserExample example);

    int updateByPrimaryKeySelective(IworkUser record);

    int updateByPrimaryKey(IworkUser record);
}