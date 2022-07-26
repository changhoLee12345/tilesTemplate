package co.edu.notice.ajaxweb;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import co.edu.common.Control;
import co.edu.notice.serviceImpl.NoticeServiceImpl;
import co.edu.notice.vo.NoticeVO;


public class AjaxNoticeInsert implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 저장하기
		NoticeServiceImpl dao = new NoticeServiceImpl();
		
		NoticeVO vo = new NoticeVO();
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		vo.setWdate(Date.valueOf(request.getParameter("wdate")));

		dao.insertNotice(vo);
		System.out.println(vo);
		Gson gson = new Gson();
		String str = gson.toJson(vo);
		return "ajax:"+str;
	}
}
