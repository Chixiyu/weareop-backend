package com.weareop.weareopbackend.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RegisterMapper {
    @Insert("insert into up(up_name,up_tag_color,up_tag_text,password) values(#{upName},#{upTagColor},#{upTagText},#{password})")
    public void register(String upName,String upTagColor,String upTagText,String password);
}
