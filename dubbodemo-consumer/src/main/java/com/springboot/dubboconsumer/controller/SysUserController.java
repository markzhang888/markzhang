package com.springboot.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.service.ISysUserSV;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//import com.springboot.model.SysUser;

@RestController
@RequestMapping(value ="/user")
public class SysUserController {
    @Reference
	private ISysUserSV sysUserSv; // <dubbo:reference :

	@RequestMapping(value = "/get-id")
	public Object getUser(@RequestParam ("id") long id) {
     return  sysUserSv.select(id);
	}

	@RequestMapping(value = "/get-name")
	public Object getMessage(@RequestParam ("name") String name) {
		return  sysUserSv.sayHi(name);
	}



}
