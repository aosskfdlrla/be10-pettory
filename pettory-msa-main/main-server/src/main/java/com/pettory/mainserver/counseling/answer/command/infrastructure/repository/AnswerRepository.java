package com.pettory.mainserver.counseling.answer.command.infrastructure.repository;

import com.pettory.mainserver.counseling.answer.command.domain.aggregate.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}