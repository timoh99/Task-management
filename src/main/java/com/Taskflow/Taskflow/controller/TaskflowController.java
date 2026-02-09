package com.Taskflow.Taskflow.controller;


//import com.Taskflow.Taskflow.TaskflowApplication;
import com.Taskflow.Taskflow.service.TaskflowService;
import com.Taskflow.Taskflow.service.TaskflowServiceimpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskflowController {
private TaskflowService taskService;
public TaskflowController(TaskflowService taskService){this.taskService=taskService;}

    @GetMapping("/Tasks")
    public ResponseEntity<List<Task>>getAllTasks(){
List<Task> task = TaskflowService.getAllTasks();
return new ResponseEntity<>(task,HttpStatus.OK);
    }

    @PostMapping("/createTask")
    public  ResponseEntity<String> createTask(){
        TaskflowService.createTask(task);
        return new ResponseEntity<>("New Task created succesfully",HttpStatus.CREATED);
}










}
