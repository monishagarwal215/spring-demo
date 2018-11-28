package com.example.demo.service.impl;

import com.example.demo.service.LoginService;
import com.example.demo.vo.request.LoginRequestVo;
import com.example.demo.vo.response.CommonResponseVo;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

  @Override
  public CommonResponseVo login(LoginRequestVo loginRequestVo) {
    CommonResponseVo responseVo = new CommonResponseVo();

    if (loginRequestVo.getPassword().equalsIgnoreCase(loginRequestVo.getUsername())) {
      responseVo.setStatus(true);
      responseVo.setMessage("Successfully Logged in");
    } else {
      responseVo.setStatus(false);
      responseVo.setMessage("Not Logged in");
    }

    return responseVo;
  }
}
