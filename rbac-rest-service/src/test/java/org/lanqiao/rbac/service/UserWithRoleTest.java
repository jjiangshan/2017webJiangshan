package org.lanqiao.rbac.service;

import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.lanqiao.rbac.base.BaseUnitTester;
import org.lanqiao.rbac.entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.lanqiao.rbac.DTO.UserWithRole;
import java.util.HashMap;
import java.util.List;

public class UserWithRole {
    private  UserWithRoleService userWithRoleService;
    @Test
    public void testFindUserAndRoleById() {
      userWithRoleService.findUserAndRole();



    }
}
