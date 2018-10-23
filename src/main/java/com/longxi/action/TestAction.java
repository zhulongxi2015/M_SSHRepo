package com.longxi.action;

import com.longxi.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import javax.print.DocFlavor;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value="test",
        results = {
        @Result(name ="success", location ="/success.jsp"),
        @Result(name="error",location = "/error.jsp")
})
public class TestAction extends ActionSupport{

    private String param1;
    public void setParam1(String param1){
        this.param1=param1;
    }
    public  String gerParam1(){
        return this.param1;
    }

    //×Ô¶¯×¢Èëservice
    @Autowired
    private UserService userService;

    //http://localhost:8080/test!test.action  ---error.jsp
    //http://localhost:8080/test!test.action?param1=success--success.jsp
    public String test()throws Exception{
        System.out.println("action test");
        if("success".equals(param1)){
            return SUCCESS;
        }
        else {
            return ERROR;
        }
    }
}
