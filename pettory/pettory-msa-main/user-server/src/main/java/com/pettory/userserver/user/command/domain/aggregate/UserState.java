package com.pettory.userserver.user.command.domain.aggregate;

public enum UserState {
    ACTIVE,  // 활성화
    SUSPEND,  // 정지
    DELETE;   // 탈퇴
}
