package com.example.spring_boot2.service;



import com.example.spring_boot2.model.User;
import com.example.spring_boot2.userDAO.UserDAO;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceImp implements UserService {

    private final UserDAO userDAO;

    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }


    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public User show(int id) {
       return userDAO.show(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }



}
