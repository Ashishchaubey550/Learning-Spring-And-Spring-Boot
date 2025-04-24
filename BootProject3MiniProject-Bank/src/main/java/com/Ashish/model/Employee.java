package com.Ashish.model;

public class Employee {
    private Integer empno;
    private String ename;
    private String desg;
    private Double salery;
    private Integer deptno;
    private Double grossSalery;
    private Double netSalery;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public Double getSalery() {
        return salery;
    }

    public void setSalery(Double salery) {
        this.salery = salery;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Double getGrossSalery() {
        return grossSalery;
    }

    public void setGrossSalery(Double grossSalery) {
        this.grossSalery = grossSalery;
    }

    public Double getNetSalery() {
        return netSalery;
    }

    public void setNetSalery(Double netSalery) {
        this.netSalery = netSalery;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", desg='" + desg + '\'' +
                ", salery=" + salery +
                ", deptno=" + deptno +
                ", grossSalery=" + grossSalery +
                ", netSalery=" + netSalery +
                '}';
    }
}
