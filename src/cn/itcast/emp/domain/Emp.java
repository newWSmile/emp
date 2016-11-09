package cn.itcast.emp.domain;

import java.util.Date;
import java.util.UUID;

/** 员工
 * Created by wyj on 2016/9/29.
 */
public class Emp {
    private String id;
    private String username;
    private Double salary;
    private Date hiredata;

    public String getId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHiredata() {
        return hiredata;
    }

    public void setHiredata(Date hiredata) {
        this.hiredata = hiredata;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", salary=" + salary +
                ", hiredata=" + hiredata +
                '}';
    }
}
