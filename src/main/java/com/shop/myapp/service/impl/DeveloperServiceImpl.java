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

    @Autowired
    DeveloperMapper developerMapper;


    @Override
    public boolean create(DeveloperDTO developerDTO) {
        {
            return save(developerDTO);
        }
    }

    @Override
    public boolean update(DeveloperDTO developerDTO) {
        return updateById(developerDTO);
    }

    @Override
    public boolean delete(Long id) {
        return removeById(id);
    }

    @Override
    public DeveloperDTO list_one(Long id) {
        return getById(id);
    }


    @Override
    public List<DeveloperDTO> list_all() {
        return list();
    }
}
