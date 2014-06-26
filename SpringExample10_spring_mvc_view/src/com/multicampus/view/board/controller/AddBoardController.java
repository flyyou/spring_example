package com.multicampus.view.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multicampus.view.board.vo.BoardVO;

@Controller
@RequestMapping("/addBoard.do")
public class AddBoardController {
	@RequestMapping(method=RequestMethod.GET)
	public String showAddBoard(Model model){
		BoardVO board = new BoardVO();		
		board.setTitle("title asdf.");
		board.setWriter("writer asdf.");
		board.setContent("content asdfasdfasdfasdf.");
		
		model.addAttribute("board", board);
		return "addBoard.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addBoard(BoardVO vo, HttpSession session) {
		session.setAttribute("board", vo);
		return "redirect:getBoardList.do";
	}	
}
