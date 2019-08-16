package com.qf.service.impl;

import com.qf.dao.MenuInfoMapper;
import com.qf.service.MenuInfoService;
import com.qf.vo.MenuInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2019/8/2.
 */
@Service
public class MenuInfoServiceImpl implements MenuInfoService{

    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoVO> listMenuByRoleId(int roleId) {
        return menuInfoMapper.listMenuByRoleId(roleId);
    }
}
