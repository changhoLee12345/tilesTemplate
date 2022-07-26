package co.edu.notice.ajaxweb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Control;


public class NoticeClient implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return "notice/noticeClient.tiles";
	}

}
