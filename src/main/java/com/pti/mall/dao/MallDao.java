package com.pti.mall.dao;

import com.pti.mall.entity.UmsRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MallDao {

    public UmsRole getUmsRole(int id);
}
