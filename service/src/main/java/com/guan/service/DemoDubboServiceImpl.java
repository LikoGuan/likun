package com.guan.service;

import com.guan.common.DemoDubboService;
import com.guan.common.Employee;

/**
 * Created by likoguan on 11/03/18.
 */
public class DemoDubboServiceImpl implements DemoDubboService {
    public Employee getEmployeeById(Long id) {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("GUAN");
        return employee;
    }
}
