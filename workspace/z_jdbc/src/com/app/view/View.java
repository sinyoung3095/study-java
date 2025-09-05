package com.app.view;

import com.app.domain.ReplyVO;
import com.app.repogitory.ReplyDAO;

public class View {
	public static void main(String[] args) {

//		MemberVO  memberVO = new MemberVO();
//		memberVO.setMemberEmail("test@gmail.com");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberName("test");
//		memberVO.setMemberAge(10);
//		System.out.println(memberVO);
//		
//		PostVO postVO = new PostVO();
//		postVO.setPostTitle("hi");
//		postVO.setPostContent("hi 1");
//		postVO.setMemberId(1);
//		
		
//		MemberDAO memberDAO = new MemberDAO();
//		memberDAO.insert(memberVO);
//		PostDAO postDAO = new PostDAO();
//		postDAO.insert(postVO);
		
//		reply_content,post_id, member_id
//		ReplyVO replyVO = new ReplyVO();
//		replyVO.setReplyContent("댓글 수정");
//		replyVO.setPostId(1L);
//		replyVO.setMemberId(1L);
//		replyVO.setId(1L);
//		System.out.println(replyVO);
		
		ReplyDAO replyDAO = new ReplyDAO();
		System.out.println(replyDAO.selectOne(1L));
		
//		System.out.println(replyDAO);
//		
		
	}
}
