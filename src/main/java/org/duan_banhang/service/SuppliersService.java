package org.duan_banhang.service;

import org.duan_banhang.model.Suppliers;
import org.springframework.http.ResponseEntity;

public interface SuppliersService {
    ResponseEntity<?> getList();

    ResponseEntity<?> save(Suppliers suppliers);

    ResponseEntity<?> delete(int supplierId);

    ResponseEntity<?> findById(int supplierId);
}
