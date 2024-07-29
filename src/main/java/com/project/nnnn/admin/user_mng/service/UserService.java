package com.project.nnnn.admin.user_mng.service;

import com.project.nnnn.admin.user_mng.dto.UserDto;
import com.project.nnnn.admin.user_mng.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public int save(UserDto userDto) {
        return userRepository.save(userDto);
    }
}
