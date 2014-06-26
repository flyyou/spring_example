package com.multicampus.biz.board.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.multicampus.biz.board.vo.BoardVO;

@Service("boardDAO")
public class BoardDAO extends SqlMapClientDaoSupport{
	@Autowired
	public BoardDAO(SqlMapClient sqlMapClient){
		setSqlMapClient(sqlMapClient);
	}	
	public void addBoard(BoardVO vo) {
		getSqlMapClientTemplate().insert("addBoard", vo);
	}	
	
	public ArrayList<BoardVO> getBoardList(){
		return (ArrayList<BoardVO>)getSqlMapClientTemplate().
		queryForList("getBoardList");
	}
}


