package org.duan_banhang.controller.rest;

import org.duan_banhang.model.Suppliers;
import org.duan_banhang.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suppliers")
public class RestSuppliersController {
    @Autowired
    private SuppliersService suppliersService;
    @GetMapping("/list")
    public ResponseEntity<?> getList(){
        return suppliersService.getList();
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Suppliers suppliers){
        return suppliersService.save(suppliers);
    }
    @GetMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam int supplierId){
        return suppliersService.delete(supplierId);
    }
    @GetMapping("/findById")
    public ResponseEntity<?> findById(@RequestParam int supplierId){
        return suppliersService.findById(supplierId);
    }
}
