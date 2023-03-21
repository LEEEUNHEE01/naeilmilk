package com.project.naeil.admin.member.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.project.naeil.member.vo.MemberVO;

public interface AdminMemberService {
	public ArrayList<MemberVO> listMember(HashMap condMap) throws Exception;
	public MemberVO memberDetail(String member_id) throws Exception;
	public void  modifyMemberInfo(HashMap memberMap) throws Exception;
	
	//멤버 삭제
	public void removeMember(String member_id) throws Exception;
}