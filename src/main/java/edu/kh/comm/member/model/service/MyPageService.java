package edu.kh.comm.member.model.service;

import java.io.IOException;
import java.util.Map;

import edu.kh.comm.member.model.vo.Member;

public interface MyPageService {

//	/** 비밀번호 변경
//	 * @param currentPw
//	 * @param newPw
//	 * @param loginMember
//	 * @return
//	 */
//	int changePw(String currentPw, String newPw, Member loginMember);

	/** 회원정보 수정 서비스
	 * @param paramMap
	 * @return
	 */
	int updateInfo(Map<String, Object> paramMap);

	/** 비밀번호 변경 서비스
	 * 
	 * @param paramMap
	 * @return
	 */
	int changePw(Map<String, Object> paramMap);

	/** 회원 탈퇴 서비스
	 * @param loginMember
	 * @return result
	 */
	int secession(Member loginMember);

	/** 프로필 이미지 수정
	 * @param map
	 * @return
	 */
	int updateProfile(Map<String, Object> map) throws IOException;

}
