package com.tropicalizacion.tropicalizacionbackend.servicios;

import com.tropicalizacion.tropicalizacionbackend.entidades.bd.RevisorEntidad;
import org.springframework.data.domain.Page;

public interface RevisorServicio {

    void agregarRevisor(RevisorEntidad revisorEntidad);

    void borrarRevisor(String correoRevisor);

    void modificarRevisor(RevisorEntidad nuevoRevisor);

    Page<RevisorEntidad> getRevisores(Integer pagina, Integer limite);

    RevisorEntidad consultarRevisorPorId(String id);
}
