package com.korit.library.web.api;

import com.korit.library.aop.annotation.ValidAspect;
import com.korit.library.web.dto.CMRespDto;
import com.korit.library.web.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping
public class AccountApi {

    @ValidAspect
    @PostMapping("/api/account")
    public ResponseEntity<?> register(@RequestBody @Valid UserDto userDto, BindingResult bindingResult){
        return ResponseEntity
                .created(null)
                .body(new CMRespDto<>("Create a new user", null));
    }
}
