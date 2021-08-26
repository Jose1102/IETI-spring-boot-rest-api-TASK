package edu.escuelaing.ieti.task.TaskMicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.escuelaing.ieti.task.TaskMicro.data.Task;

public interface IBoardTask extends JpaRepository<Task,Integer>{

}
