package com.itlee.quickstart.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itlee.quickstart.dao.UserDao;
import com.itlee.quickstart.domin.User;
import com.itlee.quickstart.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
