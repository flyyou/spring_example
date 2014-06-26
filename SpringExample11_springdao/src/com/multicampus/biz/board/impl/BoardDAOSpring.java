package com.multicampus.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.board.vo.BoardVO;

@Repository
public class BoardDAOSpring extends JdbcDaoSupport {
	private final String BOARD_ADD = "insert into board(seq, title, writer, content) values(?,?,?,?)";
	private final String BOARD_LIST = "select * from board order by seq desc";

	@Autowired
	public BoardDAOSpring(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}

	public void addBoard(BoardVO vo) {
		try {
			getJdbcTemplate().update(BOARD_ADD, vo.getSeq(), vo.getTitle(),
					vo.getWriter(), vo.getContent());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BoardVO> getBoardList(BoardVO vo) {
		try {
			Object[] args = new Object[0];
			return (ArrayList<BoardVO>) getJdbcTemplate().query(BOARD_LIST,
					args, new RowMapper<BoardVO>() {
						public BoardVO mapRow(ResultSet rs, int rowNum)
								throws SQLException {
							BoardVO board = new BoardVO();
							board.setSeq(rs.getInt("SEQ"));
							board.setTitle(rs.getString("TITLE"));
							board.setWriter(rs.getString("WRITER"));
							board.setContent(rs.getString("CONTENT"));
							board.setRegDate(rs.getDate("REGDATE"));
							board.setCnt(rs.getInt("CNT"));
							return board;
						}
					});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
