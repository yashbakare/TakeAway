package com.elevate.app.takeaway.service;

import com.elevate.app.takeaway.model.LoginModel;

public interface ILoginService {
    long createUserNameAndPassword(LoginModel loginModel);
}
