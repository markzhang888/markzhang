package com.springboot.dubbodemo.service.impl;

        import com.alibaba.dubbo.config.annotation.Service;
        import com.springboot.dubbodemo.mapper.SysUserMapper;
        import com.springboot.model.SysUser;
        import com.springboot.service.ISysUserSV;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;

        import java.util.Map;


/**
 * Created by zhang on 2018-07-27.
 */
//@org.springframework.stereotype.Service // spring 的bean 或者是
@Component //或@org.springframework.stereotype.Service // spring 的bean 或者是
@Service // 等价于dubbo注解  <dubbo:servie interface=  .... ref =  version=>
public class SysUserImpl implements ISysUserSV {
    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public String sayHi(String name) {
        return "hi springboot :"+name;
    }

    @Override
    public SysUser select(long id) {
        return sysUserMapper.selectByid(id);
    }


}
