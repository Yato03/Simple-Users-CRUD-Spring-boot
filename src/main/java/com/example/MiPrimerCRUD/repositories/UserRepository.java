package com.example.MiPrimerCRUD.repositories;

import com.example.MiPrimerCRUD.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Long> {

}
