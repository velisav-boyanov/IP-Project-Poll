package com.example.demo.controller;

import com.example.demo.db.models.DbFormModel;
import com.example.demo.db.models.DbUserModel;
import com.example.demo.db.repositories.DbFormRepository;
import com.example.demo.requests.AddFormRequest;
import com.example.demo.service.AnswerDetailsService;
import com.example.demo.service.FormDetailsService;
import com.example.demo.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@RestController
public class FormController {

    @Autowired
    private DbFormRepository formRepository;

    @Autowired
    private AnswerDetailsService answerService;

    @Autowired
    private JwtUserDetailsService userService;

    @Autowired
    private FormDetailsService formService;

    @RequestMapping(value = "/add_form", method = RequestMethod.POST)
    public DbFormModel createForm(@RequestBody AddFormRequest postCreationRequest) throws Exception {

        UUID uuid = UUID.randomUUID();

        DbFormModel returnForm = formRepository.save(
                new DbFormModel(
                    uuid.toString(),
                    postCreationRequest.getName(),
                    postCreationRequest.getQuestions(),
                    postCreationRequest.getUserAnswers()));

        return returnForm;
    }

    @RequestMapping(value = "/get_form", method = RequestMethod.GET)
    public DbFormModel getForm(String uuid) throws Exception {
        return formService.getForm(uuid);
    }
}
