package com.springboot.restuarant.Table4U.dao;

import com.springboot.restuarant.Table4U.entity.AdminTableManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminTableManagentRepository extends JpaRepository<AdminTableManagement, Integer> {
}
