package com.shop.myapp.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.myapp.dto.DeveloperDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


public interface DeveloperService extends IService<DeveloperDTO> {

}
