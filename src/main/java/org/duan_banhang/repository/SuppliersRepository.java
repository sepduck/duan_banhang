package org.duan_banhang.repository;

import org.duan_banhang.model.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SuppliersRepository extends JpaRepository<Suppliers, Integer> {
    @Query(value = "select s.*, a.province\n" +
            "from suppliers s,\n" +
            "     address a\n" +
            "where a.address_id = s.address_id", nativeQuery = true)
    List<Map<String,Object>> listDetailSupplier();
}
