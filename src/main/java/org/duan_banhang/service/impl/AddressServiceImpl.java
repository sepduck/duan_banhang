package org.duan_banhang.service.impl;

import org.duan_banhang.model.Address;
import org.duan_banhang.model.BaseResponse;
import org.duan_banhang.repository.AddressRepository;
import org.duan_banhang.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends BaseResponse implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public ResponseEntity<?> getList() {
        return getResponseEntity(addressRepository.findAll());
    }

    @Override
    public ResponseEntity<?> save(Address address) {
        return getResponseEntity(addressRepository.save(address));
    }

    @Override
    public ResponseEntity<?> delete(int addressID) {
        addressRepository.deleteById(addressID);
        return getResponseEntity("Bạn đã xóa thành công địa chỉ có ID = " + addressID);
    }

    @Override
    public ResponseEntity<?> findById(int addressId) {
        return getResponseEntity(addressRepository.findById(addressId).get());
    }
}
