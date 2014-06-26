package com.multicampus.biz.board.client;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.vo.BoardVO;

public class BoardServiceClient {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
		BoardService boardService = (BoardService)ctx.getBean("boardService");
		BoardVO vo = new BoardVO();
		vo.setSeq(1);
		vo.setTitle("Spring JDBC 제목");
		vo.setContent("Spring JDBC 내용");
		vo.setWriter("홍길동");
		boardService.addBoard(vo);
			
		ArrayList<BoardVO> boardList = boardService.getBoardList(new BoardVO());
			
		for (BoardVO board : boardList) {
		    System.out.println(board.toString());
		}		
	}

}


