package com.multicampus.biz.board.client;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.board.impl.BoardDAO;
import com.multicampus.biz.board.vo.BoardVO;

public class BoardServiceClient {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext(
					"applicationContext.xml");
		BoardDAO dao = (BoardDAO)ctx.getBean("boardDAO");
		
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("�����λ�");
		boardVO.setContent("�� ��Ź�帳�ϴ�.");
		boardVO.setWriter("ȫ�浿");
		dao.addBoard(boardVO);
		
		ArrayList<BoardVO> boardList = dao.getBoardList();
		for (BoardVO board : boardList) {
			System.out.println(board.toString());
		}
	}
}
