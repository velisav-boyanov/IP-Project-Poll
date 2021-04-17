package com.example.demo.db.repositories;

import com.example.demo.db.models.DbQuestionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbQuestionRepository extends CrudRepository<DbQuestionModel, Long> {
}
