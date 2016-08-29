package com.kakaocorp.www.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping(value = "/")
public class FreeMarkerController {
    public static final Logger log = LoggerFactory.getLogger(FreeMarkerController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String showIndex(Map<String,Object> model){
        String msg = "terry~";
        model.put("message", msg);
        return "index";
    }

}