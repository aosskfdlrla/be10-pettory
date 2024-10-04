package com.pettory.mainserver.walkinggroup.query.dto;

import lombok.Getter;

@Getter
// walkingGroupDTO에서 원하는 정보만을 뽑고 새로운 정보를 추가하기 위해
public class WalkingGroupDetailResponse {
    private WalkingGroupDTO walkingGroupsById;

    public WalkingGroupDetailResponse(WalkingGroupDTO walkingGroupsById) {
        this.walkingGroupsById = walkingGroupsById;
    }
}
