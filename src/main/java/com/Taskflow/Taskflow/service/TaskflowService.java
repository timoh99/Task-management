package com.Taskflow.Taskflow.service;

import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskflowService {
      List<Task> getAllTasks();
}
