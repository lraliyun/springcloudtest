package com.hae502.springcloud.dao;

import com.hae502.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/***
 * 部门dao层
 * @author LR
 * 2019/5/24
 */
@Mapper
public interface DeptDao {
    /**
     * 添加部门信息
     * @param dept
     * @return
     */
    public boolean addDept(Dept dept);

    /**
     * 根据id查找部分信息
     * @param id
     * @return
     */
    public Dept findById(Long id);

    /**
     * 查找所有部门信息
     * @return
     */
    public List<Dept> findAll();
}
