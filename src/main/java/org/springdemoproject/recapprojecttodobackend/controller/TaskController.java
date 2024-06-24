package org.springdemoproject.recapprojecttodobackend.controller;

import lombok.RequiredArgsConstructor;
import org.springdemoproject.recapprojecttodobackend.model.TaskModel;
import org.springdemoproject.recapprojecttodobackend.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todo")

public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<TaskModel>getAllTasks(){
        return taskService.getAllTasks();
    }
    @GetMapping("/{id}")
public Optional<TaskModel> getTaskById(@PathVariable String id){
        return taskService.getTaskById(id);
    }
    //one or the other one
//@GetMapping("/id")
//    public  void deleteTaskById(@PathVariable String id){
//        taskService.delecteTaskById(id);
//}
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        taskService.delecteTaskById(id);
    }
    @PostMapping
    public TaskModel creatTask(@RequestBody TaskModel taskModel) {
        return taskService.createTask(taskModel);
    }
    @PutMapping("/{id}")
    public TaskModel updateTask(@PathVariable String id, @RequestBody TaskModel taskModel) {
        return taskService.updateTask(id, taskModel);
    }

}
