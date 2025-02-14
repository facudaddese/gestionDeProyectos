package ejerciciointegrador;

import java.time.LocalDate;

public abstract class Proyecto {

    private final String nombre;
    String descripcion, estado;
    LocalDate fechaInicio, fechaFin;

    public Proyecto(String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, String estado) throws ProyectoNoValidoException {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        if (fechaFin.isBefore(fechaInicio)) {
            throw new ProyectoNoValidoException("La fecha de fin no puede ser anterior a la fecha de inicio.");
        }
    }

    public abstract void actualizarEstado();

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
