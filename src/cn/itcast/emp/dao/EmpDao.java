package cn.itcast.emp.dao;

import cn.itcast.emp.domain.Emp;
import cn.itcast.emp.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;

/** 员工管理模块
 *  持久层实现类
 * Created by wyj on 2016/9/29.
 */
public class EmpDao {
    public void add(Emp emp) throws Exception{
        QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "insert into emps(id,username,salary,hiredata) values(?,?,?,?)";
        Object params[] = {emp.getId(),emp.getUsername(),emp.getSalary(),emp.getHiredata()};
        runner.update(sql,params);

    }
}
