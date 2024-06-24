package org.springdemoproject.recapprojecttodobackend.repository;

import org.springdemoproject.recapprojecttodobackend.model.TaskModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TaskModel,String> {

}
