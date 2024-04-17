package org.duan_banhang.service;

import org.duan_banhang.model.Address;
import org.springframework.http.ResponseEntity;

public interface AddressService {
    ResponseEntity<?> getList();

    ResponseEntity<?> save(Address address);

    ResponseEntity<?> delete(int addressID);

    ResponseEntity<?> findById(int addressId);
}
