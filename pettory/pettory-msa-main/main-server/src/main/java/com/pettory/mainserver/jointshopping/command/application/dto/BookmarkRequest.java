package com.pettory.mainserver.jointshopping.command.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor    // 모든 값을 전달받은 생성자 생성
@Schema(description = "즐겨찾기 요청")
public class BookmarkRequest {

    @Schema(example = "1")
    @NotNull
    private final Long jointShoppingGroupNum;

    @Schema(example = "3")
    @NotNull
    private final Long userId;
}
