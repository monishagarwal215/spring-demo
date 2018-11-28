package com.example.demo.controller;

import com.example.demo.exception.ValidationException;
import com.example.demo.service.LoginService;
import com.example.demo.vo.request.LoginRequestVo;
import com.example.demo.vo.response.CommonResponseVo;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/v1")
public class LoginController {

  @Autowired
  private LoginService loginService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/login")
  public Response login(LoginRequestVo requestVo) {

    try {
      loginService.validate(requestVo);
    } catch (ValidationException e) {
      e.printStackTrace();
      return Response.status(HttpServletResponse.SC_BAD_REQUEST).entity(new CommonResponseVo(e.getMessage()))
          .build();
    }

    CommonResponseVo responseVo = loginService.login(requestVo);

    return Response.status(HttpServletResponse.SC_OK).entity(responseVo).build();
  }

}
