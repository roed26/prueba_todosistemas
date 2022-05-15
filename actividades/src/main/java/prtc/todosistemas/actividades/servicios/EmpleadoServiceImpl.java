package prtc.todosistemas.actividades.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prtc.todosistemas.actividades.modelo.Empleado;
import prtc.todosistemas.actividades.repositorio.EmpleadoRepositorio;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepositorio empleadoRepositorio;

	@Override
	public List<Empleado> empleados() {
		
		return empleadoRepositorio.findAll();
	}

	
}
