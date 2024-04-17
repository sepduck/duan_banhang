package org.duan_banhang.controller.rest;

import org.duan_banhang.model.Address;
import org.duan_banhang.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class RestAddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/list")
    public ResponseEntity<?> getList() {
        return addressService.getList();
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Address address) {
        return addressService.save(address);
    }

    @GetMapping("delete")
    public ResponseEntity<?> delete(@RequestParam int addressId) {
        return addressService.delete(addressId);
    }

    @GetMapping("/findById")
    public ResponseEntity<?> findById(@RequestParam int addressId) {
        return addressService.findById(addressId);
    }
}
