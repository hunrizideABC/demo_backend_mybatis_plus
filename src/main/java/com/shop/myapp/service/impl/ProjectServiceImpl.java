package com.shop.myapp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.myapp.dao.ProjectMapper;
import com.shop.myapp.dto.ProjectDTO;
import com.shop.myapp.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, ProjectDTO> implements ProjectService {

}
