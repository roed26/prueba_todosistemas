package prtc.todosistemas.actividades.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prtc.todosistemas.actividades.servicios.ActividadService;
import prtc.todosistemas.actividades.modelo.Actividad;


@RestController
@RequestMapping("api/actividad")
@CrossOrigin(origins="*")
public class ActividadControlador {
	
	@Autowired
	private ActividadService actividadService;
	
	

	@GetMapping("/listar")
	public ResponseEntity<List<Actividad>> listaActividades(){
		List<Actividad> list = actividadService.actividades();
	
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	

	@PostMapping("/registrar")
	public ResponseEntity<Actividad> create(@RequestBody Actividad actividad){
		return new ResponseEntity<>(actividadService.save(actividad),HttpStatus.CREATED);

	
	 
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable Long id){
		Optional<Actividad> oActividad = actividadService.findById(id);
		
		if(!oActividad.isPresent()) {
		return ResponseEntity.notFound().build();	
		}
		
		return ResponseEntity.ok(oActividad); 

	}

	@DeleteMapping("/eliminar/{id}")
    public String deleteActividad(@PathVariable("id")Long id){
        actividadService.deleteById(id);
        return "eliminado";
    }
	
	@PostMapping("/editar")
	public ResponseEntity<Actividad> edit(@RequestBody Actividad actividad){
		return new ResponseEntity<>(actividadService.save(actividad),HttpStatus.OK);

	
	 
	}

}
