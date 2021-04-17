package com.example.demo.db.repositories;

import com.example.demo.db.models.DbFormModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbFormRepository extends CrudRepository<DbFormModel, Long> {
}
