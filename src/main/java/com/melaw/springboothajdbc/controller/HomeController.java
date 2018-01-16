package com.melaw.springboothajdbc.controller;

import com.melaw.springboothajdbc.model.T1;
import com.melaw.springboothajdbc.repository.T1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by MeLaw on 2018/1/12.
 */
@Controller
public class HomeController {

    @Autowired
    private T1Repository t1Repository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        System.out.println("index...");
        return "index";
    }

    @RequestMapping(value = "/add/{count}", method = RequestMethod.GET)
    public String add(ModelMap modelMap, @PathVariable int count) {
        System.out.println("add...");

        System.out.println("t1 before add count(): " + t1Repository.count());

        for(int i = 0; i < count; i++) {
            T1 t1 = new T1();
            t1.setI((int) (Math.random() * 1000));
            t1Repository.save(t1);
        }

        System.out.println("t1 after add count(): " + t1Repository.count());

        return "add";
    }

}
