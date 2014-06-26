package com.multicampus.biz.board.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.board.vo.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends HibernateDaoSupport {
	@Autowired
	public BoardDAO(HibernateTemplate hibernateTemplate) {
		super.setHibernateTemplate(hibernateTemplate);
	}

	public void addBoard(BoardVO vo) throws Exception {
		getHibernateTemplate().save(vo);
	}

	public ArrayList<BoardVO> getBoardList() throws Exception {
		return (ArrayList<BoardVO>) getHibernateTemplate().find("from BoardVO");
	}
}
