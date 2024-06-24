package org.springdemoproject.recapprojecttodobackend.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springdemoproject.recapprojecttodobackend.model.TaskModel;
import org.springdemoproject.recapprojecttodobackend.repository.TaskRepository;

import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TaskServiceTest {
@Mock
private TaskRepository taskRepository;
@InjectMocks
private TaskService taskService;

public TaskServiceTest(){
    MockitoAnnotations.openMocks(this);
}
    @Test
    void getAllTasks() {
        TaskService taskService = new TaskService();
        List<TaskModel> modelList = taskService.getAllTasks();
    }
@Test
    void testGetAllTasks() {
        TaskService taskService1 = new TaskService();
        taskService1.getTaskById("task1");
        TaskService taskService2 = new TaskService();
        taskService2.getTaskById("task2");
    //when(taskRepository.findAll()).thenReturn((List<TaskModel>) taskService1, taskService2);

    List<TaskModel> tasks = taskService1.getAllTasks();
    assertEquals(2, tasks.size());
    }
    @Test
    void getTaskById() {
    }

    @Test
    void delecteTaskById() {
    }

    @Test
    void createTask() {
    }

    @Test
    void updateTask() {
    }
}