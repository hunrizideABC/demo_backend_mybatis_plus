package com.shop.myapp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.myapp.dto.DeveloperDTO;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface DeveloperMapper extends BaseMapper<DeveloperDTO> {

}
