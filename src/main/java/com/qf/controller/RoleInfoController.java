package com.qf.controller;

import com.qf.dto.UserRoleDTO;
import com.qf.service.RoleInfoService;
import com.qf.vo.MenuInfoVO;
import com.qf.vo.RoleInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2019/8/1.
 */
@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService roleInfoService;

    @RequestMapping("listRoleInfoByUserId")
    public Object listRoleInfoByUserId(@RequestParam int userId){
        return roleInfoService.listRoleByUserId(userId);
    }


    @RequestMapping("insertUserRole")
    public Object insertUserRole(@RequestBody UserRoleDTO userRoleDTO){
        System.out.println(userRoleDTO);
        return roleInfoService.addUserRole(userRoleDTO);
    }

    @RequestMapping("removeUserRole")
    public Object removeUserRole(@RequestBody UserRoleDTO userRoleDTO){
        System.out.println(userRoleDTO);
        return roleInfoService.removeUserRole(userRoleDTO);
    }

    //根据roleid做获取一个集合，其中包含所有的菜单及被选择的菜单
    @RequestMapping("listMenuByRoleId")
    public Object listMenuByRoleId(@RequestParam int roleId){
        List<MenuInfoVO> parents = new ArrayList<MenuInfoVO>();
        MenuInfoVO parentMenu1 = new MenuInfoVO();
        parentMenu1.setId(1);
        parentMenu1.setName("测试父菜单1");
        parentMenu1.setPid(0);
        parentMenu1.setSeqno(0);

        MenuInfoVO chileMenu1 = new MenuInfoVO();
        chileMenu1.setId(2);
        chileMenu1.setName("测试子菜单1");
        chileMenu1.setPid(1);
        chileMenu1.setSeqno(0);
        parentMenu1.appendChild(chileMenu1);
        MenuInfoVO chileMenu2 = new MenuInfoVO();
        chileMenu2.setId(3);
        chileMenu2.setName("测试子菜单2");
        chileMenu2.setPid(1);
        chileMenu2.setSeqno(0);
        parentMenu1.appendChild(chileMenu2);
        MenuInfoVO chileMenu3 = new MenuInfoVO();
        chileMenu3.setId(4);
        chileMenu3.setName("测试子菜单3");
        chileMenu3.setPid(1);
        chileMenu3.setSeqno(0);
        parentMenu1.appendChild(chileMenu3);

        parents.add(parentMenu1);
        return parents;
    }
}
