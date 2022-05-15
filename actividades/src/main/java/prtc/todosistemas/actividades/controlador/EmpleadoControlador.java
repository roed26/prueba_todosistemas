package prtc.todosistemas.actividades.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prtc.todosistemas.actividades.modelo.Empleado;
import prtc.todosistemas.actividades.servicios.EmpleadoService;

@RestController
@RequestMapping("api/empleado")
@CrossOrigin("*")
public class EmpleadoControlador {

	@Autowired
	private EmpleadoService empleadoService;
	
	

	@GetMapping("/listar")
	public ResponseEntity<List<Empleado>> listaActividades(){
		List<Empleado> list = empleadoService.empleados();
		
		return new ResponseEntity<List<Empleado>>(list, HttpStatus.OK);
	}
}
