package edu.kh.comm.board.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.comm.board.model.vo.Reply;

public interface ReplyService {

	/** 댓글 목록 조회 서비스
	 * @param boardNo 
	 * @return rList
	 */
	List<Reply> selectReplyList(int boardNo);

	/** 댓글 등록
	 * @param reply
	 * @return
	 */
	int insertReply(Reply reply);

	/** 댓글 수정
	 * @param paramMap
	 * @return
	 */
	int updateReply(Map<String, Object> paramMap);

	/** 댓글 삭제
	 * @param replyNo
	 * @return
	 */
	int deleteReply(int replyNo);

	

}
