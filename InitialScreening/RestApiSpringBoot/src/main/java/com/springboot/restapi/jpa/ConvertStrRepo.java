package com.springboot.restapi.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restapi.entity.ConvertStr;
@Repository
public interface ConvertStrRepo extends CrudRepository<ConvertStr, Integer> {}
 

