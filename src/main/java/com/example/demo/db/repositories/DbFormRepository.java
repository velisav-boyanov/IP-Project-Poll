package com.example.demo.db.repositories;

import com.example.demo.db.models.DbFormModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DbFormRepository extends CrudRepository<DbFormModel, Long> {
    DbFormModel findByUuid(String uuid);
}
