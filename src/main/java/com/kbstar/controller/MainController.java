package com.kbstar.controller;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class MainController {

    @Autowired
    CustService custService;

    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("center", "login");//{center}에 login을 뿌려줘라.
        return "index";
    }
    @RequestMapping("/loginimpl")
    public String loginimpl(Model model, String id, String pwd){
        log.info("--------------"+id+" "+pwd);
        model.addAttribute("center", "login");//{center}에 login을 뿌려줘라.
        return "index";
    }
    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("center", "register");
        return "index";
    }
    @RequestMapping("/registerimpl")
    public String registerimpl(Model model, Cust cust) throws Exception {
        try {
            custService.register(cust);
        } catch (Exception e) {
            throw new Exception("시스템에러 : maincontroller registerimpl");
        }
        model.addAttribute("rcust", cust);
        model.addAttribute("center", "registerok");
        return "index";
    }
    // /quics?page=bs01
    @RequestMapping("/quics")
    public String quics(String page){//page선언하지 않고도 이게 돼? 컨테이너에서 해줘
        return page;
    }

}
