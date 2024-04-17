package org.duan_banhang.service;

import org.duan_banhang.model.Categories;
import org.springframework.http.ResponseEntity;

public interface CategoriesService {
    ResponseEntity<?> getList();
    ResponseEntity<?> save(Categories categories);
    ResponseEntity<?> delete(int categoryID);
    ResponseEntity<?> findById(int categoryID);
}
