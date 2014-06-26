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
		board.setTitle("ù ��° ����� ���Դϴ�.");
		board.setWriter("ȫ�浿");
		board.setContent("�����λ��Դϴ�. �� ��Ź�帳�ϴ�.");
		board.setRegDate(new Date(System.currentTimeMillis()));
		board.setCnt(11);
		
		model.put("board", board);
		return "getBoard.jsp";
	}
}
