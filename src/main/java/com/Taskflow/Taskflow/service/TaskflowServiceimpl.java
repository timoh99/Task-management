package com.Taskflow.Taskflow.service;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskflowServiceimpl implements TaskflowService {

     private List<Task> task = new ArrayList<>();
@Override
     public List<Task> getAllTasks() {
        return new ArrayList<> (task);
    }
@Override
public void createTask(Task task){

}
}

