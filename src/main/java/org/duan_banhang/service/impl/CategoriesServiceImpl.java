package org.duan_banhang.service.impl;

import org.duan_banhang.model.BaseResponse;
import org.duan_banhang.model.Categories;
import org.duan_banhang.repository.CategoriesRepository;
import org.duan_banhang.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceImpl extends BaseResponse implements CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public ResponseEntity<?> getList() {
        return getResponseEntity(categoriesRepository.findAll());
    }

    @Override
    public ResponseEntity<?> save(Categories categories) {
        return getResponseEntity(categoriesRepository.save(categories));
    }

    @Override
    public ResponseEntity<?> delete(int categoryID) {
        categoriesRepository.deleteById(categoryID);
        return getResponseEntity("Bạn đã xóa thành công loại sản phẩm có ID = " + categoryID);
    }

    @Override
    public ResponseEntity<?> findById(int categoryID) {
        return getResponseEntity(categoriesRepository.findById(categoryID).get());
    }
}
