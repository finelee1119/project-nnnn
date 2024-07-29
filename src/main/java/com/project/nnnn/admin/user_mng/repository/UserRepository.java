package com.project.nnnn.admin.user_mng.repository;

import com.project.nnnn.admin.user_mng.dto.UserDto;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public int save(UserDto userDto) {
        System.out.println("userDto = " + userDto);
        return 0;
    }
}
