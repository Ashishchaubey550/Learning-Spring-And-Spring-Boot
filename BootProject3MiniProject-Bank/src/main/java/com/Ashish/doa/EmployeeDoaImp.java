package com.Ashish.doa;

import com.Ashish.model.Employee;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("empDAo")
public class EmployeeDoaImp implements IEmployeeDoa {

    private DataSource ds;

    @Override
    public List<Employee> showEmployeeByDesgs(String desg1, String desg2, String desg3) {
        return null;
    }
}
