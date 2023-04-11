package com.shop.myapp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.myapp.dto.ProjectDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper extends BaseMapper<ProjectDTO> {

}

