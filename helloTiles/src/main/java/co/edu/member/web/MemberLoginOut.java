package co.edu.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edu.common.Control;

public class MemberLoginOut implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그아웃 처리
		HttpSession session = request.getSession();
		session.invalidate(); // 세션을 삭제한다
		return "main.do";
	}

}
