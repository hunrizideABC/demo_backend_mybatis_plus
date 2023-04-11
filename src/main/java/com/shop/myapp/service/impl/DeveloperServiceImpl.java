package com.shop.myapp.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.myapp.dao.DeveloperMapper;
import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeveloperServiceImpl extends ServiceImpl<DeveloperMapper, DeveloperDTO>  implements DeveloperService {

}
