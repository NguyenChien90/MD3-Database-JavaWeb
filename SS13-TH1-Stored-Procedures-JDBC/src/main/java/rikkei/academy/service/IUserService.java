package rikkei.academy.service;

import rikkei.academy.model.User;

import java.util.List;

public interface IUserService {
    void insertUser(User user);
    List<User> selectAllUsers();
    boolean deleteUser(int id);
    boolean updateUser(User user);
    User getUserById(int id);
    void insertUserStore(User user);
}



