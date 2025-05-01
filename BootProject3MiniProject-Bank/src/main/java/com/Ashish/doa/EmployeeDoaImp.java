package com.Ashish.doa;

import com.Ashish.model.Employee;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository("empDAo")
public class EmployeeDoaImp implements IEmployeeDoa {

    private DataSource ds;

    //SQL Query

    private static final String GET_EMPS_QUERY = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOb";


    @Override
    public List<Employee> showEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {

        ArrayList list=null;

        //Get Pooled jdbc con

        try(Connection con=ds.getConnection();
            PreparedStatement p=con.prepareStatement(GET_EMPS_QUERY);
        ){

            //set values to query params
            p.setString(1,desg1);
            p.setString(2,desg2);
            p.setString(3,desg3);

            //execute the SQL Query
            try(ResultSet rs=p.executeQuery()){
                //Process the ResultSet object
                list=new ArrayList();
                while (rs.next()){
                    //copy each record into model class obj
                    Employee emp = new Employee();
                    emp.setEmpno(rs.getInt(1));
                    emp.setEname(rs.getString(2));
                    emp.setDesg(rs.getString(3));
                    emp.setSalary(rs.getDouble(4));
                    emp.setDeptno(rs.getInt(5));
                    list.add(emp);
                }
                // add Employee class object to LIST COLLECTION
            }// nested try
        }//outer try
        catch (SQLException se){
            se.printStackTrace();
            throw  se;
        } catch (Exception e) {
            e.printStackTrace();
            throw  e;
        }

        return null;
    }
}
