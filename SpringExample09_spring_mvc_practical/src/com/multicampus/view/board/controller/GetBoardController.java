package com.multicampus.view.board.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multicampus.view.board.vo.BoardVO;

@Controller
@RequestMapping("/getBoard.do")
public class GetBoardController {
	@RequestMapping
	public String getBoard(ModelMap model) {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("첫 번째 등록한 글입니다.");
		board.setWriter("홍길동");
		board.setContent("가입인사입니다. 잘 부탁드립니다.");
		board.setRegDate(new Date(System.currentTimeMillis()));
		board.setCnt(11);
		
		model.put("board", board);
		return "getBoard.jsp";
	}
}
