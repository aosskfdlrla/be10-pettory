package com.pettory.userserver.pet.query.service;

import com.pettory.userserver.exception.EmptyResultException;
import com.pettory.userserver.pet.query.dto.PetDTO;
import com.pettory.userserver.pet.query.mapper.PetMapper;
import com.pettory.userserver.security.util.UserSecurity;
import com.pettory.userserver.user.query.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetQueryService {

    private final PetMapper petMapper;
    private final UserMapper userMapper;

    public List<PetDTO> getAllPetsByUserId(String userEmail) {

        UserSecurity.validateCurrentUser(userEmail);

        // 로그인 회원 id 조회
        Long userId = userMapper.findUserIdByEmail(userEmail).getUserId();

        // 반려동물 정보 조회
        List<PetDTO> pets = petMapper.findPetsByUserId(userId);

        if (pets.isEmpty()) {
            throw new EmptyResultException("반려동물이 없습니다.");
        }
        return pets;
    }
}
