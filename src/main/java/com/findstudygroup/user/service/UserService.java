package com.findstudygroup.user.service;

import com.findstudygroup.user.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    protected static final String NAMESPACE = "user.";

    @Autowired
    private SqlSession sqlSession;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = sqlSession.selectOne(NAMESPACE + "login");
        return null;
    }
}
