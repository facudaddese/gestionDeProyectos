package ejerciciointegrador;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AdministracionProyecto {

    Set<Proyecto> proyectos;

    public AdministracionProyecto() {
        this.proyectos = new HashSet<>();
    }

    public void registrarProyecto(Proyecto p) throws ProyectoNoValidoException {

        for (Proyecto proyecto : proyectos) {
            if (p.getNombre().equals(proyecto.getNombre())) {
                throw new ProyectoNoValidoException("Ya existe un proyecto con el mismo nombre\n");
            }
        }
        if (p.getFechaFin().isBefore(p.getFechaInicio())) {
            throw new ProyectoNoValidoException("La fecha de comienzo no puede ser mayor a la fecha de finalizacion");
        }
        proyectos.add(p);
        System.out.println("Proyecto agregado");
    }

    public void eliminarProyectos(String nombre) throws ProyectoNoValidoException {

        Iterator<Proyecto> iterator = proyectos.iterator();
        while (iterator.hasNext()) {
            Proyecto proyecto = iterator.next();
            if (proyecto.getNombre().equals(nombre)) {
                iterator.remove();
                System.out.println("Proyecto eliminado\n");
                return;
            }
        }
        throw new ProyectoNoValidoException("No existe proyecto en nuestra Base de Datos\n");
    }

    public void actualizarProyectos(String nombre, LocalDate fechaInicio, LocalDate fechaFin) throws ProyectoNoValidoException {

        if (fechaInicio == null || fechaFin == null) {
            throw new ProyectoNoValidoException("Las fechas de inicio y fin no pueden ser nulas\n");
        }
        if (fechaFin.isBefore(fechaInicio)) {
            throw new ProyectoNoValidoException("La fecha de comienzo no puede ser mayor a la fecha de finalizacion\n");
        }

        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equals(nombre)) {
                proyecto.setFechaInicio(fechaInicio);
                proyecto.setFechaFin(fechaFin);
            }
        }

        System.out.println("Fechas de proyecto actualizadas\n");
    }

    public void mostrarProyectos() {

        System.out.println("--- PROYECTOS ---");
        for (Proyecto proyecto : proyectos) {
            if (proyectos.isEmpty()) {
                System.out.println("No quedan proyectos");
            } else {
                System.out.println(". " + proyecto.getNombre() + " | " + proyecto.fechaInicio + " | " + proyecto.fechaFin);
            }
        }
    }

    public void mostrarEstado() {

        for (Proyecto proyecto : proyectos) {
            System.out.println(". " + proyecto.getNombre() + " | " + proyecto.estado);
        }
    }
}
