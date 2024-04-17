package org.duan_banhang.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ducnhungshop")
public class CategoryController {
    @GetMapping("/category/list")
    public String getList(){
        return "categories/list";
    }
    @GetMapping("/category/save/{categoryId}")
    public String save(Model model, @PathVariable int categoryId){
        model.addAttribute("categoryId", categoryId);
        return "categories/save";
    }
}
