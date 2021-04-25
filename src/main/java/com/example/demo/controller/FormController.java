package com.example.demo.controller;

import com.example.demo.db.models.DbFormModel;
import com.example.demo.db.models.DbUserModel;
import com.example.demo.db.repositories.DbFormRepository;
import com.example.demo.requests.AddFormRequest;
import com.example.demo.service.AnswerDetailsService;
import com.example.demo.service.FormDetailsService;
import com.example.demo.service.JwtUserDetailsService;
import com.example.demo.service.QuestionDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class FormController {

    @Autowired
    private DbFormRepository formRepository;

    @Autowired
    private AnswerDetailsService answerService;

    @Autowired
    private QuestionDetailsService questionService;

    @Autowired
    private JwtUserDetailsService userService;

    @Autowired
    private FormDetailsService formService;

    @RequestMapping(value = "/add_form", method = RequestMethod.POST)
    public DbFormModel createForm(@RequestBody AddFormRequest postCreationRequest) throws Exception {

        UUID uuid = UUID.randomUUID();
        Optional<DbUserModel> user = userService.loadUserByUsername((DbUserModel) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal()
                .getUsername());

        DbFormModel returnForm = formRepository.save(new DbFormModel(
                uuid.toString(),
                user.get().getId(),
                postCreationRequest.getName(),
                postCreationRequest.getQuestions(),
                postCreationRequest.getUserAnswers()));

        return returnForm;
    }

    @RequestMapping(value = "/get_form", method = RequestMethod.GET)
    public DbFormModel getForm(@RequestBody long id) throws Exception {
        //bruh how do i get shit with this trash
        
    }
}
