package cn.lx.bm.service.impl;

import dp.service.BaseService;
import cn.lx.bm.service.UserService;
import cn.lx.bm.model.User;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseService implements UserService {
    public void insertUser(User t){
        dao.insert("cn.lx.bm.sql.User.insert", t);
    }

    public int updateUser(User t){
        int row = dao.update("cn.lx.bm.sql.User.update", t);
        return row;
    }

    public int deleteUser(String t ){
        return dao.delete("cn.lx.bm.sql.User.delete", t);
    }

    public User getUserById(String t){
        return dao.queryForObject("cn.lx.bm.sql.User.getById", t, User.class);
    }

	public List<User> query(String t) {
		return dao.queryForList("cn.lx.bm.sql.User.query", t, User.class);
	}

}