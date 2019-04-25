package com.spring.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.graphql.model.User;
import com.spring.graphql.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;

    public User createUser(String firstName, String lastName) {
        User user1 = new User();
        user1.setFirstName(firstName);
        user1.setLastName(lastName);
        return userRepository.save(user1);
    }

}
