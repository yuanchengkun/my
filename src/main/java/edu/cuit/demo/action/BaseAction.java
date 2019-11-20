package edu.cuit.demo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuanck 2016051230
 * 描述：项目启动的基本控制器
 */
@Controller
@RequestMapping("BaseAction")
public class BaseAction {
    @RequestMapping("index")
    public String execute(){
        //test
        print();
        return "index";
    }

    private void print(){
        System.out.println("修改");
    }
}
