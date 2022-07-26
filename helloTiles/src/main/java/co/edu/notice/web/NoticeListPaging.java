package co.edu.notice.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Control;
import co.edu.common.Paging;
import co.edu.notice.serviceImpl.NoticeServiceImpl;
import co.edu.notice.vo.NoticeVO;

public class NoticeListPaging implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String page = request.getParameter("page");

		page = page == null ? "1" : page;
		int pageCnt = Integer.parseInt(page);

		NoticeServiceImpl service = new NoticeServiceImpl();
		List<NoticeVO> listTotal = service.noticeSelectList();

		service = new NoticeServiceImpl();
		List<NoticeVO> list = service.selectNoticeListPaging(pageCnt);

		Paging paging = new Paging();
		paging.setPageNo(pageCnt);
		paging.setPageSize(10);
		paging.setTotalCount(listTotal.size());

		request.setAttribute("notices", list);
		request.setAttribute("paging", paging);

		return "notice/noticeListPaging.tiles";
	}

}
