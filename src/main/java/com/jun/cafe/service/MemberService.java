package com.jun.cafe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jun.cafe.dao.MemberDao;
import com.jun.cafe.dto.Member;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;
	
	public void login(Member m) throws Exception{
		memberDao.login(m);
	}
	
	public void insertMember(Member m) throws Exception{
		memberDao.insertMember(m);
	}
}
