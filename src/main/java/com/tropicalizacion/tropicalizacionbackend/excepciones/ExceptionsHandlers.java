package com.tropicalizacion.tropicalizacionbackend.excepciones;

import com.tropicalizacion.tropicalizacionbackend.entidades.CustomResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Contiene los métodos que manejan las excepciones que se tiran en el resto de métodos
 */
@ControllerAdvice
public class ExceptionsHandlers {

    /**
     * Maneja cualquier excepción que extienda a la excepción general
     *
     * @param e excepción
     * @return retorna la respuesta al cliente con la información de la excepción
     */
    @ExceptionHandler
    public ResponseEntity<CustomResponse> handleException(ExcepcionGeneral e) {
        return new ResponseEntity<>(e.getExcepcionMensaje(), e.getEstado());
    }
}
