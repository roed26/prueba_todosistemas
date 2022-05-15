package prtc.todosistemas.actividades.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prtc.todosistemas.actividades.modelo.Actividad;

@Repository
public interface ActividadRepositorio extends JpaRepository<Actividad, Long> {

	
}
