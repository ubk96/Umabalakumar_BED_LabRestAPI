package com.gl.CollegeFest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.CollegeFest.Entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer>{

}
