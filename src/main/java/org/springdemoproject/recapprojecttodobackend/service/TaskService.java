package org.springdemoproject.recapprojecttodobackend.service;

import org.springdemoproject.recapprojecttodobackend.model.TaskModel;
import org.springdemoproject.recapprojecttodobackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskModel> getAllTasks(){
         return taskRepository.findAll();
    }
     public Optional<TaskModel> getTaskById(String id){
        return  taskRepository.findById(id);
     }
     public void delecteTaskById(String id){
         if (taskRepository.existsById(id)) {
             taskRepository.deleteById(id);
         }
        taskRepository.findById(id);
     }
public TaskModel createTask(TaskModel taskModel){
        return  taskRepository.save(taskModel);
}
public TaskModel updateTask(String id, TaskModel description){
        //TaskModel taskModel  = taskRepository.findById(id).orElseThrow();
    return taskRepository.save(description);
}

}
