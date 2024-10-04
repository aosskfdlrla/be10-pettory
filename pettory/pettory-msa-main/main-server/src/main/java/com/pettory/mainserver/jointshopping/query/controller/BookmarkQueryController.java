package com.pettory.mainserver.jointshopping.query.controller;

import com.pettory.mainserver.jointshopping.query.dto.*;
import com.pettory.mainserver.jointshopping.query.service.JointShoppingGroupQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "즐겨찾기")
@RestController
@RequiredArgsConstructor    // final을 받은 필드의 생성자를 주입
@RequestMapping("/jointshopping")
public class BookmarkQueryController {

    private final JointShoppingGroupQueryService jointShoppingGroupQueryService;

    @Operation(summary = "즐겨찾기된 모임 목록 조회", description = "즐겨찾기된 모임 목록을 조회한다.")
    @ApiResponse(responseCode = "200", description = "즐겨찾기된 모임 목록 조회 성공")
    @GetMapping("/bookmarks")
    public ResponseEntity<JointShoppingGroupListResponse> getBookmarks(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam @Schema(example = "3") Long userId
    ) {

        JointShoppingGroupListResponse response = jointShoppingGroupQueryService.getBookmarks(page, size, userId);

        return ResponseEntity.ok(response);
    }

}

