package com.springboot.restuarant.Table4U.dao;

import com.springboot.restuarant.Table4U.entity.ResTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResTableRepository extends JpaRepository<ResTable, Integer> {

    @Query("SELECT t.price FROM ResTable t Where t.tableNumber= :tableId")
    Double getPriceById(@Param("tableId")Integer tableId);

}
