package com.multicampus.biz.board.impl;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.multicampus.biz.board.vo.BoardVO;
import com.multicampus.service.util.SessionManager;

public class BoardDAO {
	private SqlSession session = 
		SessionManager.getSqlSession().openSession();

	public void addBoard(BoardVO vo) {		
		session.insert("addBoard", vo);
	}
	
	public ArrayList<BoardVO> getBoardList(BoardVO vo) {
		return (ArrayList<BoardVO>)session.selectList("getBoardList", vo);
	}
}

