package com.YipYapTimeAPI.YipYapTimeAPI.services;

import com.YipYapTimeAPI.YipYapTimeAPI.exception.UserException;
import com.YipYapTimeAPI.YipYapTimeAPI.models.User;
import com.YipYapTimeAPI.YipYapTimeAPI.request.UpdateUserRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService{

    User findUserProfile(String jwt);

    User updateUser(UUID userId, UpdateUserRequest req) throws UserException;

    User findUserById(UUID userId) throws UserException;

    List<User> searchUser(String query);
}
