package com.example.demo.service;

import com.example.demo.db.models.DbFormModel;
import com.example.demo.db.repositories.DbFormRepository;
import org.springframework.stereotype.Service;

@Service
public class FormDetailsService{
    private final DbFormRepository formRepository;

    public FormDetailsService(DbFormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public DbFormModel addForm(DbFormModel form){
        return formRepository.save(form);
    }

}
