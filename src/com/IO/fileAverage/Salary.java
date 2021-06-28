package com.IO.fileAverage;

public class Salary {
    private int id;
    private String deptName;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
