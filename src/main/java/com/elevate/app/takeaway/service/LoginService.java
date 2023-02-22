package com.elevate.app.takeaway.service;

import com.elevate.app.takeaway.dto.user.UserLogin;
import com.elevate.app.takeaway.exceptions.CustomException;
import com.elevate.app.takeaway.model.LoginModel;
import com.elevate.app.takeaway.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{

    @Autowired
    LoginRepository loginRepository;

    @Override
    public long createUserNameAndPassword(LoginModel loginModel) {

        try {
            UserLogin login = new UserLogin();
            login.setUserName(loginModel.getUsername());
            login.setPassword(loginModel.getPassword());
            return loginRepository.save(login).getId();

        } catch (Exception e) {
            throw new CustomException("Error storing user record");
        }
    }
}
