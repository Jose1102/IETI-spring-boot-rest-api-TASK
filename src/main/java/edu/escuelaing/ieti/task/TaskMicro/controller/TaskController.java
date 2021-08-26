package edu.escuelaing.ieti.task.TaskMicro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.ieti.task.TaskMicro.data.Task;
import edu.escuelaing.ieti.task.TaskMicro.repository.IBoardTask;


@RestController
@RequestMapping(path = "/v1/task")
public class TaskController {
	
	@Autowired
	private IBoardTask task;
	
	@GetMapping
    ResponseEntity<List<Task>> all() {
		List<Task> listaUsuarios = task.findAll();
        return new ResponseEntity<List<Task>>(listaUsuarios, HttpStatus.OK);
    }
	
	@GetMapping( value = "/{id}" )
    public ResponseEntity<Optional<Task>> findById( @PathVariable Integer id )
    {
       //TODO implement this method using UserService
		Optional<Task> tarea = task.findById(id);
		return new ResponseEntity<Optional<Task>>(tarea, HttpStatus.OK);
     
    }
	
	@PostMapping
    public void create( @RequestBody Task tareaAgregar )
    {
		task.save(tareaAgregar);
    }
	
	@PutMapping
    public void update( @RequestBody Task tareaActualizar )
    {
		task.save(tareaActualizar);
       
    }
	
	@DeleteMapping( value = "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable Integer id )
    {
		try{
            task.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        }catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.OK).body(false);
        }
    }

}
