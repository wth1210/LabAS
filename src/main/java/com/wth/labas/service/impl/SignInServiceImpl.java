package com.wth.labas.service.impl;

import com.wth.labas.bean.SignIn;
import com.wth.labas.mapper.SignInMapper;
import com.wth.labas.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    SignInMapper signInMapper;


    @Override
    public SignIn getSignInById(String qid) {
        return signInMapper.getSignInById(qid);
    }

    @Override
    public SignIn getSignInByUid(String uid) {
        return signInMapper.getSignInByUid(uid);
    }

    @Override
    public void updateSignIn(SignIn signIn) {
        signInMapper.updateSignIn(signIn);
    }

    @Override
    public void insertSignIn(SignIn signIn) {
        signInMapper.insertSignIn(signIn);

    }
}
