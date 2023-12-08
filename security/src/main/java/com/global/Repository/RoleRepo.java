package com.global.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.global.entity.Roles;

@Repository
public interface RoleRepo extends JpaRepository<Roles, Long>{

}
