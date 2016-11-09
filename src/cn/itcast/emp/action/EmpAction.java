package cn.itcast.emp.action;

import cn.itcast.emp.domain.Emp;
import cn.itcast.emp.service.EmpService;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 员工管理模块表现层
 * 控制器
 * Created by wyj on 2016/9/29.
 */
public class EmpAction extends AbstractCommandController {
    private EmpService service;

    public EmpService getService() {
        return service;
    }

    public void setService(EmpService service) {
        this.service = service;
    }

    //将表单参数封装到emp实体中
    public EmpAction() {
        this.setCommandClass(EmpAction.class);
    }

    //自定义string->data的转换器
    @Override
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }

    @Override
    protected ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object obj, BindException e) throws Exception {
        ModelAndView view = new ModelAndView();
        Emp emp= (Emp) obj;
        System.out.println(obj);
        service.add(emp);
        System.out.println(emp);
        view.addObject("message","操作成功");
        view.setViewName("/success.jsp");
        return view;

    }



}
