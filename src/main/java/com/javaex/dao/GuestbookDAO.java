package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVO;

@Repository
public class GuestbookDAO {

	// 필드
	@Autowired
	private SqlSession sqlSession;


	//리스트 가져오기 /////////////////////////////////////////////
	public List<GuestbookVO> guestbookSelect() {
	
		System.out.println("GuestbookDAO.guestbookSelect()");
		
		List<GuestbookVO> guestbookList = sqlSession.selectList("guestbook.selectList");
		
		return guestbookList;
	}

	
	//리스트 등록하기 /////////////////////////////////////////////
	public int guestbookInsert(GuestbookVO guestbookVO) {
	
		System.out.println("GuestbookDAO.guestbookInsert()");
		
		int count = sqlSession.insert("guestbook.insert", guestbookVO);
		
		return count;
	}
	

	//리스트 삭제하기 /////////////////////////////////////////////
	public int guestbookDelete(GuestbookVO guestbookVO) {
		
		System.out.println("GuestbookDAO.guestbookDelete()");

		int count = sqlSession.delete("guestbook.delete", guestbookVO);
		
		return count;
	}

}