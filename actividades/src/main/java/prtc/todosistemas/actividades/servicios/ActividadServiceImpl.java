package prtc.todosistemas.actividades.servicios;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import prtc.todosistemas.actividades.modelo.Actividad;
import prtc.todosistemas.actividades.repositorio.ActividadRepositorio;

@Service
@Transactional
public class ActividadServiceImpl implements ActividadService {

	@Autowired
	private ActividadRepositorio actividadRepositorio;
	
	public List<Actividad> actividades() {
		return this.actividadRepositorio.findAll();
	}

	@Override
	@Transactional
	public Iterable<Actividad> findAll() {
		// TODO Auto-generated method stub
		return this.actividadRepositorio.findAll();
	}

	@Override
	@Transactional
	public Page<Actividad> findAll(Pageable pageable) {
		
		return this.actividadRepositorio.findAll(pageable);
	}

	@Override
	public Optional<Actividad> findById(Long id) {
		return this.actividadRepositorio.findById(id);
		}

	@Override
	@Transactional
	public Actividad save(Actividad actividad) {
		return actividadRepositorio.save(actividad);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		this.actividadRepositorio.deleteById(id);
	}
	

}
