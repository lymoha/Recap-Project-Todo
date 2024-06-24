package org.springdemoproject.recapprojecttodobackend.model;

import lombok.With;

@With
public record TaskModelDTO(String description, String status){

}
