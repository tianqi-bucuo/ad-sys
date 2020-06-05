package com.cky.ad.service;


import com.cky.ad.exception.AdException;
import com.cky.ad.vo.CreateUserRequest;
import com.cky.ad.vo.CreateUserResponse;

public interface IUserService {
    // 创建用户
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
