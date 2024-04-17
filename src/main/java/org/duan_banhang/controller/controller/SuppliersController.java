package org.duan_banhang.controller.controller;

import org.duan_banhang.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/supplier")
public class SuppliersController {
    @Autowired
    private SuppliersService suppliersService;
    @GetMapping
    public String getList(){
        return "supplier/view";
    }
    @GetMapping("/save/{supplierId}")
    public String save(@PathVariable int supplierId, Model model){
        model.addAttribute("supplierId", supplierId);
        return "supplier/save";
    }
}
