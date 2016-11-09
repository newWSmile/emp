package cn.itcast.emp.service;

import cn.itcast.emp.dao.EmpDao;
import cn.itcast.emp.domain.Emp;
import cn.itcast.emp.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;

/** 员工管理模块
 *  业务层实现类
 * Created by wyj on 2016/9/29.
 */
public class EmpService {
    private EmpDao dao;

    public EmpDao getDao() {
        return dao;
    }

    public void setDao(EmpDao dao) {
        this.dao = dao;
    }

    public void add(Emp emp) throws Exception{
       dao.add(emp);

    }
}
