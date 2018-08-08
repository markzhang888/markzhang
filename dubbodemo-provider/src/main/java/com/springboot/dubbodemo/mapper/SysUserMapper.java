package com.springboot.dubbodemo.mapper;

import com.springboot.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by zhang on 2018-07-27.
 */
//@Mapper
public interface SysUserMapper {
    /**
     * 根据对象插入一条新数据
     * @return void
     * @throws Exception
     */
    void insert(SysUser sysUser);

    /**
     * 删除一条数据
     * @return void
     * @throws Exception
     */
    void delete(Long userId);

    /**
     * 批量删除
     * @return void
     * @throws Exception
     */
    void batchDelete(List<Integer> ids);

    /**
     * 更新一条数据
     * @return void
     * @throws Exception
     */
    void update(SysUser sysUser);

    /**
     * 根据id返回 查询一条数据
     * @param id
     * @return T
     * @throws Exception
     */
    SysUser selectByid(Long id);

    /**
     * 查询一条数据
     * @param map
     * @return map
     * @throws Exception
     */
   SysUser selectByMap(Map<String, Object> map)throws Exception;


    /**
     * 查询列表
     * @param map
     * @return map
     * @throws Exception
     */
    List<SysUser> getListByMap(Map<String, Object> map);
}
