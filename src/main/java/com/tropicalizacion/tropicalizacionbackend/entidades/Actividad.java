package com.tropicalizacion.tropicalizacionbackend.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "actividad")
@Setter @Getter @Builder @AllArgsConstructor @NoArgsConstructor
public class Actividad {
    @EmbeddedId
    private ActividadPK actividadPK;

    @Column(name = "fecha")
    @NotNull
    private Date fecha;

    @Column(name = "hora")
    @NotNull
    private Time hora;

    @Column(name = "estado", columnDefinition = "ENUM('Pendiente', 'Aprobada', 'Rechazada')", length = 10)
    @NotNull
    private String estado;

    @Column(name = "detalles", columnDefinition = "MEDIUMTEXT")
    @NotNull
    private String detalles;

    @Column(name = "justificacion_rechazo", columnDefinition = "MEDIUMTEXT")
    private String justificacionRechazo;

    @Column(name = "decision")
    private boolean decision;

    @ManyToOne
    @MapsId("correoEstudiante")
    @JoinColumn(name = "fk_correo_estudiante", referencedColumnName = "pk_correo_usuario")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "fk_nombre_categoria", referencedColumnName = "pk_nombre")
    @NotNull
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "fk_nombre_proyecto", referencedColumnName = "pk_nombre")
    @NotNull
    private Proyecto proyecto;

    @ManyToOne
    @JoinColumn(name = "fk_correo_revisor", referencedColumnName = "pk_correo_usuario")
    private Revisor revisor;
}
