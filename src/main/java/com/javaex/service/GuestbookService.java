package com.javaex.service;

import java.util.List;

import com.javaex.dao.GuestbookDAO;
import com.javaex.vo.GuestbookVO;

public class GuestbookService {
	
	//필드
	
	
	//생성자
	
	
	//메소드 gs
	
	
	//메소드 일반
	//전체 리스트 ///////////////////////////////////////////////////
	public List<GuestbookVO> exeGetGuestbookList() {
		System.out.println("GuestbookService.exeGetGuestbookList()");
		
		//dao를 통해서 일한다
		GuestbookDAO guestbookDAO = new GuestbookDAO();
		List<GuestbookVO> guestbookList = guestbookDAO.guestbookSelect();
		
		return guestbookList;
	}

	//리스트 등록 ///////////////////////////////////////////////////
	public int exeGetGuestbookAdd(GuestbookVO guestbookVO) {
		System.out.println("GuestbookService.exeGetGuestbookAdd()");
		
		//dao를 통해서 일한다
		GuestbookDAO guestbookDAO = new GuestbookDAO();
		int count = guestbookDAO.guestbookInsert(guestbookVO);
		
		return count;
	}
	
	//리스트 삭제 ///////////////////////////////////////////////////
	public int exeGetGuestbookRemove(GuestbookVO guestbookVO) {
		System.out.println("GuestbookService.exeGetGuestbookRemove()");
		
		//dao를 통해서 일한다
		GuestbookDAO guestbookDAO = new GuestbookDAO();
		int count = guestbookDAO.guestbookDelete(guestbookVO);
		
		return count;
	}
	
	
	
}
