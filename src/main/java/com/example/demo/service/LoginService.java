package com.example.demo.service;

import com.example.demo.vo.request.LoginRequestVo;
import com.example.demo.vo.response.CommonResponseVo;

public interface LoginService extends CommonService{

  CommonResponseVo login(LoginRequestVo loginRequestVo);

}
