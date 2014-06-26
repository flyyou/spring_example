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
		BoardVO board = (BoardVO)session.getAttribute("board");
		boardList.add(board);
		
		session.setAttribute("boardList", boardList);
		
		return "getBoardList.jsp";
	}
}
