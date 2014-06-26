package com.multicampus.view.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multicampus.view.board.vo.BoardVO;

@Controller("/getBoardList.do")
public class GetBoardListController {
	@RequestMapping
	public String getBoardList(HttpSession session){
		ArrayList<BoardVO> boardList = new ArrayList<BoardVO>();
		BoardVO board1 = new BoardVO(1, "첫 번째 글", "홍길동", 0);
		BoardVO board2 = new BoardVO(2, "두 번째 글", "홍길동", 3);
		BoardVO board3 = new BoardVO(3, "세 번째 글", "홍길동", 10);
		boardList.add(board1);
		boardList.add(board2);
		boardList.add(board3);
		
		session.setAttribute("boardList", boardList);
		
		return "getBoardList.jsp";
	}
}
