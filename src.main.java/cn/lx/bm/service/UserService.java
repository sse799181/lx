package cn.lx.bm.service;

import java.util.List;

import cn.lx.bm.model.User;

public interface UserService {
    void insertUser(User t);
    int updateUser(User t);
    int deleteUser(String t);
    User getUserById(String t);
    List<User> query(String t);
}