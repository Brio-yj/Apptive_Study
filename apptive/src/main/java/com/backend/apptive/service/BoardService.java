package com.backend.apptive.service;

import com.backend.apptive.DTO.BoardDTO;
import com.backend.apptive.DTO.BoardResponseDTO;
import com.backend.apptive.domain.Board;

import java.util.List;

public interface BoardService {
    BoardResponseDTO registerBoard(BoardDTO boardDTO);
    List<BoardDTO> getAllBoards();
    BoardDTO getBoardById(Long postID);
    List<BoardDTO> getBoardsByNameAndPhoneNumber(String userName, String phoneNumber);
    BoardResponseDTO updateUserById(Long boardId, String newUserPhoneNumber);
}
