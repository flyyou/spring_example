package com.multicampus.biz.board.client;

import java.util.List;

import org.hibernate.Session;

import com.multicampus.biz.board.vo.BoardVO;
import com.multicampus.service.util.HibernateUtil;

public class BoardServiceClient {
	public static void main(String[] args) {
		try {
			HibernateUtil.beginTransaction();
			Session session = HibernateUtil.getCurrentSession();
			BoardVO board = new BoardVO();
			board.setTitle("�����λ�");
			board.setWriter("ȫ�浿");
			board.setContent("�� ��Ź�帳�ϴ�.");

			int num = (Integer) session.save(board);
			System.out.println(num + " �� �Խù� ���� ����!!!");

			getBoardList(session);
			HibernateUtil.commitTransaction();
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
		} finally {
			HibernateUtil.closeSession();
		}
	}

	public static void getBoardList(Session session) {
		List<BoardVO> result = session.createQuery("from BoardVO").list();
		for (BoardVO board : result) {
			System.out.println(board);
		}
	}
}
