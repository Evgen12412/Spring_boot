package com.example.spring_boot2.userDAO;



import com.example.spring_boot2.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void createUser(User user);

    public void deleteUser(int id);

    public void updateUser(User user);

    public User show(int id);
}
