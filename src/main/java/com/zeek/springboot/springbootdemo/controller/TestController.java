package com.zeek.springboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * 参考：
 * https://www.cnblogs.com/chenpi/p/6347299.html
 *
 * https://www.cnblogs.com/mengmeng89012/p/5519698.html
 *
 */
@Controller
@RequestMapping("/tests")
public class TestController {

    @GetMapping
    @ResponseBody
    public Object hello() {

        return "hello world" ;
    }

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> firstResp (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.getSession().setAttribute("request-Url", request.getRequestURL());
        map.put("request-Url", request.getRequestURL());
        return map;
    }

    @RequestMapping(value = "/sessions", method = RequestMethod.GET)
    @ResponseBody
    public Object sessions (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("request-Url"));
        return map;
    }
}
