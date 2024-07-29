package com.project.nnnn.admin.user_mng.controller;

import com.project.nnnn.admin.user_mng.dto.UserDto;
import com.project.nnnn.admin.user_mng.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor // final이 붙은 필드만 가지고 생성자를 만드는 어노테이션
public class UserController {
    private final UserService userService;

    @GetMapping("/save")
    public String saveForm() {
        return "/admin/user_mng/save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute UserDto userDto) {
        int saveResult = userService.save(userDto);

        if (saveResult > 0) {
            return "/common/login/login";
        } else {
            return "/admin/user_mng/save";
        }
    }
}
