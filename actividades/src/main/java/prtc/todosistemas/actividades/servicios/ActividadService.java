package prtc.todosistemas.actividades.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import prtc.todosistemas.actividades.modelo.Actividad;

public interface ActividadService  {
	
	public List<Actividad> actividades();
	public Iterable<Actividad> findAll();
	public Page<Actividad> findAll(Pageable pageable);
	public Optional<Actividad> findById(Long id);
	public Actividad save(Actividad actividad);
	public void deleteById(Long id);
}
