package com.wit.bwash.service;

import com.wit.bwash.dao.models.User;
import com.wit.bwash.dao.repository.UserRepository;
import com.wit.bwash.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;


    @Override
    public void createRequest(UserDTO userDTO) {
        User user = new User();
        user.setNameUser(userDTO.getNameUser());
        user.setPhoneUser(userDTO.getPhoneUser());
        user.setLocalUser(userDTO.getLocalUser());
        user.setTimeUser(userDTO.getTimeUser());
        user.setRequestUser(userDTO.getRequestUser());
        userRepository.save(user);
    }
}
