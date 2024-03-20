package com.SBapp.SBapp.repository;

import com.SBapp.SBapp.models.App;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppRepository extends MongoRepository<App,String>
{

}
