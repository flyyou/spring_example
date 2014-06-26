package com.multicampus.view.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multicampus.view.board.vo.BoardVO;
import com.multicampus.view.controller.Controller;

public class GetBoardListController implements Controller {
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ArrayList<BoardVO> boardList = new ArrayList<BoardVO>();
		BoardVO board1 = new BoardVO(1, "1", "a", 0);
		BoardVO board2 = new BoardVO(2, "2", "b", 3);
		BoardVO board3 = new BoardVO(3, "3", "c", 10);
		boardList.add(board1);
		boardList.add(board2);
		boardList.add(board3);
		request.getSession().setAttribute("boardList", boardList);

		return "getBoardList.jsp";
	}
}
