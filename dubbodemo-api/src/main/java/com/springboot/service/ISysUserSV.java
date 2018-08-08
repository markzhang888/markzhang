package com.springboot.service;

import com.springboot.model.SysUser;

import java.util.Map;

/**
 * Created by zhang on 2018-07-27.
 */
public interface ISysUserSV {
       String sayHi(String name);
      SysUser select(long id);


}
