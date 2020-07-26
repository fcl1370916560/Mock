package com.pti.mall;

import com.pti.mall.entity.UmsRole;
import com.pti.mall.service.MallService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test2 {

    @Autowired
    private MallService mallService;

    //@Autowired
    //private MallDao mallDao;

    @Test
    public void getUmsRole(){
        //UmsRole umsRole = new UmsRole();
        //umsRole = mallDao.getUmsRole(1);
        UmsRole umsRole = mallService.getUmsRole(1);
        System.out.println(umsRole);


    }
}
