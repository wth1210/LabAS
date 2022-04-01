package com.wth.labas.mapper;


import com.wth.labas.bean.Consumer;
import com.wth.labas.bean.SignIn;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignInMapper {
    public SignIn getSignInById(String qid);
    public SignIn getSignInByUid(String uid);
    public void updateSignIn(SignIn signIn);
    public void insertSignIn(SignIn signIn);
}
