package com.thang.story.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterForm {
    private String username;

    private String password;

    private String confirmPassword;

    private String email;

    private String phone;
}
