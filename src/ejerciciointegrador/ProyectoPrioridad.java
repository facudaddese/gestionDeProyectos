package ejerciciointegrador;

import java.time.LocalDate;

public class ProyectoPrioridad extends Proyecto {

    private int prioridad;

    public ProyectoPrioridad(int prioridad, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, String estado) throws ProyectoNoValidoException {
        super(nombre, descripcion, fechaInicio, fechaFin, estado);
        this.prioridad = prioridad;
        if (fechaFin.isBefore(fechaInicio)) {
            throw new ProyectoNoValidoException("La fecha de fin no puede ser anterior a la fecha de inicio.");
        }
    }

    @Override
    public void actualizarEstado() {

        if (fechaFin.isBefore(LocalDate.now())) {
            setEstado("Finalizado");
        } else {
            setEstado("En progreso");
        }
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

}
