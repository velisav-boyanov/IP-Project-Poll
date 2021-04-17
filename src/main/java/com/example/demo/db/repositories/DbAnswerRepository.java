package com.example.demo.db.repositories;

import com.example.demo.db.models.DbAnswerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbAnswerRepository extends CrudRepository<DbAnswerModel, Long> {
}
