package com.tropicalizacion.tropicalizacionbackend.repositorios;

import com.tropicalizacion.tropicalizacionbackend.entidades.bd.RevisorEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RevisoresRepositorio extends JpaRepository<RevisorEntidad, String> {
}
