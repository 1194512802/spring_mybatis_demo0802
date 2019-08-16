package com.qf.service;

import com.qf.vo.MenuInfoVO;

import java.util.List;

/**
 * Created by DELL on 2019/8/2.
 */
public interface MenuInfoService {

    public List<MenuInfoVO> listMenuByRoleId(int roleId);
}
