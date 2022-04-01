package com.wth.labas.service;

import com.wth.labas.bean.SignIn;

public interface SignInService {
    public SignIn getSignInById(String qid);
    public SignIn getSignInByUid(String uid);
    public void updateSignIn(SignIn signIn);
    public void insertSignIn(SignIn signIn);
}
