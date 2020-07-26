package com.pti.mall;

import com.pti.mall.dao.MallDao;
import com.pti.mall.entity.UmsRole;
import com.pti.mall.service.MallService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
public class MallTest {
    @Mock
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
