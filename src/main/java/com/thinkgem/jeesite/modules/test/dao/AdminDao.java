package com.thinkgem.jeesite.modules.test.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.test.entity.Admin;
import com.thinkgem.jeesite.modules.test.entity.Criteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@MyBatisDao
public interface AdminDao extends CrudDao<Admin> {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Admin record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Admin record);

    /**
     * 根据条件查询记录集
     */
    List<Admin> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    Admin selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") Admin record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") Admin record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Admin record);
}