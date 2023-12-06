package com.example.template.template.Repository;

import com.example.template.template.model.Templatemodel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TemplateRepo extends MongoRepository<Templatemodel,String >{

}