package prtc.todosistemas.actividades.servicios;

import java.util.List;

import prtc.todosistemas.actividades.modelo.Empleado;

public interface EmpleadoService  {

	
	public List<Empleado> empleados();
	
	/*no se hara uso por el momento
	
	public Empleado save(Empleado empleado);
	public Page<Empleado> findAll(Pageable pageable);
	public Optional<Empleado> findById(Long id);
	public void deleteById(Long id);
	*/	
}
