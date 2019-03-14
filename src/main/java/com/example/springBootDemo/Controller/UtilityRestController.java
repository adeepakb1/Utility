package com.example.springBootDemo.Controller;

import com.example.springBootDemo.BootStrap.UtilityClass;
import com.example.springBootDemo.Model.Order;
import com.example.springBootDemo.Model.Pnv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UtilityRestController {

    @Autowired
    UtilityClass utilityClass;


    @RequestMapping("/pnv1")
    @ResponseBody
    public Pnv pnv1(@RequestParam String env, @RequestParam String email, @RequestParam String toDo) {
        Pnv pnv = utilityClass.dojedis(email, env, toDo);
        return pnv;
    }

    @RequestMapping("/order1")
    @ResponseBody
    public Order order1(){
        return new Order();
    }



}
