package com.platformnexus.app.unanimous.controller;

import com.platformnexus.app.unanimous.entity.model.UserProfile;
import com.platformnexus.app.unanimous.entity.repo.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by felixchiu on 3/13/16.
 */
@RestController
@RequestMapping(value="/service/user")
public class UserController {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserProfile> getUser() {
        return userProfileRepository.findAll();
    }
}
