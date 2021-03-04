package com.sieurevietstore.controller;


import com.sieurevietstore.model.User;
import com.sieurevietstore.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin (origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;


    // get all employees
    @GetMapping("/User")
    public List< User > getAllEmployees() {
          return   usersRepository.findAll();
}
}
