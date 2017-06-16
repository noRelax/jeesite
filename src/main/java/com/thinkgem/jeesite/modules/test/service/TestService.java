/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.test.service;

import com.thinkgem.jeesite.modules.test.entity.Admin;
import com.thinkgem.jeesite.modules.test.entity.Criteria;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.test.entity.Test;
import com.thinkgem.jeesite.modules.test.dao.TestDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试Service
 *
 * @author ThinkGem
 * @version 2013-10-17
 */
@Service
public class TestService extends CrudService<TestDao, Test> {
    @Autowired
    public TestDao testDao;
    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;

    public List<Test> getTestList() {
        return testDao.findAllList();
    }

    @Transactional(readOnly = false)
    public void updateAdmin() {
        Admin record = new Admin();
        record.setName("wusong");
        Map<String, Object> condition = new HashMap<String, Object>();
        condition.put("username", "w吴松");
        Map _parameter = new HashMap();
        _parameter.put("record", record);
        _parameter.put("condition", condition);
        int result = sqlSessionTemplate.update("com.thinkgem.jeesite.modules.test.entity.Admin.updateByExampleSelective", _parameter);
        System.out.println("result>>>>>" + result);
    }


}
