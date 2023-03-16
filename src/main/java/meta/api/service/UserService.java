/*
 * UserService.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package meta.api.service;

import java.util.List;
import java.util.Optional;

import meta.api.entity.User;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public interface UserService
{
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long userId);
    Optional<User> findByUsername(String username);
}



/*
 * Changes:
 * $Log: $
 */