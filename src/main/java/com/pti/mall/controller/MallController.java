package com.pti.mall.controller;

import com.pti.mall.entity.UmsRole;
import com.pti.mall.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MallController {

    @Autowired
    private MallService mallService;

    @ResponseBody
    @RequestMapping("/getUmsRole")
    public UmsRole getUmsRole(int id){
        return mallService.getUmsRole(id);
    }

}
