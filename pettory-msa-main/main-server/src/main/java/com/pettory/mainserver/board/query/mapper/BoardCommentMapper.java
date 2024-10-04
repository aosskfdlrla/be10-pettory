package com.pettory.mainserver.board.query.mapper;

import com.pettory.mainserver.board.query.dto.BoardCommentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardCommentMapper {

    List<BoardCommentDTO> selectComments(@Param("postNum") int postNum);

    int countComments(@Param("postNum") int postNum);
}
