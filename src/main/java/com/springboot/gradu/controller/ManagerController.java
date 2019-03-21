package com.springboot.gradu.controller;


import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ManagerController {

    @RequestMapping(value = "/mana.do", method = RequestMethod.GET)
    public String index(HttpServletRequest request,
                        HttpServletResponse response, ModelMap model) throws Exception {

        return "index";
    }
}
