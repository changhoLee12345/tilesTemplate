package co.edu.notice.ajaxweb;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import co.edu.common.Control;
import co.edu.notice.serviceImpl.NoticeServiceImpl;
import co.edu.notice.vo.NoticeVO;


public class AjaxNoticeList implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		NoticeServiceImpl dao = new NoticeServiceImpl();
		List<NoticeVO> list = dao.noticeSelectList();
		Gson gson = new Gson();
		String str = gson.toJson(list);
		return "ajax:"+str;
	}
}
