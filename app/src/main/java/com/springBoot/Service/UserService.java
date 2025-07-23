package com.springBoot.Service;


import com.springBoot.UserConfig.UsersConfig;

public class UserService {
    UsersConfig usersConfig;

    public UserService(UsersConfig usersConfig) {
        this.usersConfig = usersConfig;
    }

    public String getUserName() {
        return usersConfig.getName();
    }

}
