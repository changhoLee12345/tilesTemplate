package co.edu.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edu.common.Control;
import co.edu.member.service.MemberService;
import co.edu.member.serviceImpl.MemberServiceImpl;
import co.edu.member.vo.MemberVO;

public class MemberJoin implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(); // 세션객체에 서버가 가지고 있는 세션객체를 담는다

		// TODO 이곳에 회원가입 처리를 작성한다.
		String id = request.getParameter("memberId");
		String name = request.getParameter("memberName");
		String pass = request.getParameter("memberPassword");
		String addr = request.getParameter("memberAddress");

		MemberVO member = new MemberVO();
		member.setMemberId(id);
		member.setMemberName(name);
		member.setMemberPassword(pass);
		member.setMemberAddress(addr);

		MemberService service = new MemberServiceImpl();
		service.insertMember(member);

		session.setAttribute("id", id);
		request.setAttribute("member", member);

		return "main/main.tiles";
	}

}
