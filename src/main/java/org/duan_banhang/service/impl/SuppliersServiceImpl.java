package org.duan_banhang.service.impl;

import org.duan_banhang.model.BaseResponse;
import org.duan_banhang.model.Suppliers;
import org.duan_banhang.repository.SuppliersRepository;
import org.duan_banhang.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SuppliersServiceImpl extends BaseResponse implements SuppliersService {
    @Autowired
    private SuppliersRepository suppliersRepository;
    @Override
    public ResponseEntity<?> getList() {
        return getResponseEntity(suppliersRepository.listDetailSupplier());
    }

    @Override
    public ResponseEntity<?> save(Suppliers suppliers) {
        return getResponseEntity(suppliersRepository.save(suppliers));
    }

    @Override
    public ResponseEntity<?> delete(int supplierId) {
        suppliersRepository.deleteById(supplierId);
        return getResponseEntity("Bạn đã xóa thành công nhà cung cấp có ID = " + supplierId);
    }

    @Override
    public ResponseEntity<?> findById(int supplierId) {
        return getResponseEntity(suppliersRepository.findById(supplierId).get());
    }
}
