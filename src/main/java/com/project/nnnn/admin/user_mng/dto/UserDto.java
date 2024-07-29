package com.project.nnnn.admin.user_mng.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
    private Long id;
    private String name;
    private String userId;
    private String userPw;
    private String juminNo;
    private String phone;
    private String email;
}
