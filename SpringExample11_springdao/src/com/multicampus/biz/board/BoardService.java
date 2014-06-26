package com.multicampus.biz.board;

import java.util.ArrayList;

import com.multicampus.biz.board.vo.BoardVO;

public interface BoardService {
	public ArrayList<BoardVO> getBoardList(BoardVO vo);
	public void addBoard(BoardVO vo);
}
