package com.pti.mall.service;

import com.pti.mall.dao.MallDao;
import com.pti.mall.entity.UmsRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MallService {

    @Autowired
    private MallDao mallDao;

    public UmsRole getUmsRole(int id){
        return mallDao.getUmsRole(id);
    }

}
