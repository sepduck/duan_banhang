package org.duan_banhang.controller.rest;

import org.duan_banhang.model.Categories;
import org.duan_banhang.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class RestCategoryController {
    @Autowired
    private CategoriesService categoriesService;
    @GetMapping("/list")
    public ResponseEntity<?> getList(){
        return categoriesService.getList();
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Categories categories){
        return categoriesService.save(categories);
    }
    @GetMapping("delete")
    public ResponseEntity<?> delete(@RequestParam int categoryId){
        return categoriesService.delete(categoryId);
    }
    @GetMapping("/findById")
    public ResponseEntity<?> findById(@RequestParam int categoryId){
        return categoriesService.findById(categoryId);
    }
}
