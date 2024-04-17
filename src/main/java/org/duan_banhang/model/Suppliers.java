package org.duan_banhang.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplierId;
    private String companyName;
    private String contactTitle;
    private String contactName;
    private int addressId;
    private String city;
    private String region;
    private String postal_code;
    private String country;
    private String phone;
    private String fax;
    private String homePage;
}
