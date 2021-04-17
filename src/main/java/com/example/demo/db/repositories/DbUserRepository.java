package com.example.demo.db.repositories;

import com.example.demo.db.models.DbUserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface DbUserRepository extends CrudRepository<DbUserModel, Long> {
    Optional<DbUserModel> findByUsername(String username);
}
