package com.weareop.weareopbackend.mapper;

import com.weareop.weareopbackend.entity.Up;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LoginMapper {
    @Select("select * from up where up_name=#{upName}")
    public Up loginByUpName(String upName,String password);
}
