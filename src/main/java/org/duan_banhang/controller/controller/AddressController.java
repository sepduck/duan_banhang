package org.duan_banhang.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ducnhungshop")
public class AddressController {
    @GetMapping("/list")
    public String getList(){
        return "address/list";
    }

}
