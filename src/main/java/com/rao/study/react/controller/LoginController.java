package com.rao.study.react.controller;

import com.rao.study.react.dto.LoginDto;
import com.rao.study.react.vo.ResponseVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping(value = "/login")
    public ResponseVo login(@RequestBody LoginDto loginDto){
        if("raoshihong".equals(loginDto.getUsername()) && "123".equals(loginDto.getPassword())){
            return new ResponseVo(true);
        }
        return new ResponseVo(false);
    }

}
