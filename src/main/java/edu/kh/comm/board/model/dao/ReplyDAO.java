package edu.kh.comm.board.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.comm.board.model.vo.Reply;

@Repository
public class ReplyDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	/** 댓글 목록 조회 서비스 DAO
	 * @param boardNo 
	 * @return rList
	 */
	public List<Reply> selectReplyList(int boardNo) {
		return sqlSession.selectList("replyMapper.selectReplyList", boardNo);
	}

	/** 댓글 등록
	 * @param reply
	 * @return
	 */
	public int insertReply(Reply reply) {

		return sqlSession.insert("replyMapper.insertReply", reply);
	}

	/** 댓글 수정
	 * @param paramMap
	 * @return
	 */
	public int updateReply(Map<String, Object> paramMap) {

		return sqlSession.update("replyMapper.updateReply", paramMap);
	}

	/** 댓글 삭제
	 * @param replyNo
	 * @return
	 */
	public int deleteReply(int replyNo) {

		return sqlSession.update("replyMapper.deleteReply", replyNo);
	}
}
