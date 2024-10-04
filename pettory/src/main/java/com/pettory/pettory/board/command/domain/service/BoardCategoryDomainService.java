package com.pettory.pettory.board.command.domain.service;

import com.pettory.pettory.board.command.application.dto.CategoryRequest;
import com.pettory.pettory.board.command.domain.aggregate.Category;
import com.pettory.pettory.board.command.infrastructure.repository.JPACategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardCategoryDomainService {

    private final JPACategoryRepository jPACategoryRepository;


    // 도메인 객체를 생성
    public Category createCategory(CategoryRequest categoryRequest) {
        return new Category(
                categoryRequest.getCategoryTitle()
        );
    }

    // 도메인 객체를 수정
    public void updateCategory(Category category, String categoryTitle) {
        category.updateCategory(categoryTitle);
    }

    public void deleteCategory(Category category) {

        // 카테고리 삭제
        jPACategoryRepository.delete(category);
    }
}
