package com.qf.dao;

import com.qf.pojo.MenuInfo;
import com.qf.vo.MenuInfoVO;

import java.util.List;

/**
 * Created by DELL on 2019/7/24.
 */
public interface MenuInfoMapper {

    public List<MenuInfo> listParentMenu();

    public List<MenuInfoVO> listMenuByRoleId(int roleId);
}
