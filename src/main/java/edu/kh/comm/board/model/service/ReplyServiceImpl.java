package edu.kh.comm.board.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.comm.board.model.dao.ReplyDAO;
import edu.kh.comm.board.model.vo.Reply;
import edu.kh.comm.common.Utill;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyDAO dao;

	// 댓글 목록 조회 서비스 구현
	@Override
	public List<Reply> selectReplyList(int boardNo) {
		
		return dao.selectReplyList(boardNo);
	}

	// 댓글 등록
	@Override
	public int insertReply(Reply reply) {

		// xss, 개행문자처리
		reply.setReplyContent(Utill.XSSHandling(reply.getReplyContent()));
		reply.setReplyContent(Utill.newLineHandling(reply.getReplyContent()));
		
		
		return dao.insertReply(reply);
	}

	// 댓글 수정
	@Override
	public int updateReply(Map<String, Object> paramMap) {

		return dao.updateReply(paramMap);
	}

	// 댓글 삭제
	@Override
	public int deleteReply(int replyNo) {

		return dao.deleteReply(replyNo);
	}
	
	
	
	
	
	
	
	
}
