package com.Ashish.doa;

import com.Ashish.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("empDAO")
public class EmployeDoaImp implements IEmployeDoa {
    @Autowired
    private DataSource ds;
    @Override
    public List<Employee> showEmployeesByDesgs(String desg1, String desg2, String desg3) {
        return null;
    }
}
