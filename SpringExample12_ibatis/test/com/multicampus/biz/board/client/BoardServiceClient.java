package com.multicampus.biz.board.client;

import java.util.ArrayList;

import com.multicampus.biz.board.impl.BoardDAO;
import com.multicampus.biz.board.vo.BoardVO;

public class BoardServiceClient {
	public static void main(String[] args) {
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("iBatis 제목");
		vo.setContent("iBatis 내용");
		vo.setWriter("홍길동");
		boardDAO.addBoard(vo);
		
		ArrayList<BoardVO> boardList = boardDAO.getBoardList(new BoardVO());
		for (BoardVO board : boardList) {
			System.out.println(board.toString());
		}
	}
}
