package com.example.demo.db.repositories;

import com.example.demo.db.models.DbUserAnswersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbUserAnswersRepository extends CrudRepository<DbUserAnswersModel, Long> {
}
