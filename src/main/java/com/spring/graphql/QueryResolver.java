package com.spring.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.spring.graphql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.spring.graphql.repo.UserRepository;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
       return (List<User>) userRepository.findAll();
    }

}
