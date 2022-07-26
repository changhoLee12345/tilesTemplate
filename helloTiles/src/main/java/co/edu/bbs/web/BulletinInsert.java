package co.edu.bbs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.bbs.service.BulletinService;
import co.edu.bbs.serviceImpl.BulletinServiceImpl;
import co.edu.bbs.vo.BulletinVO;
import co.edu.common.Control;

public class BulletinInsert implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");

		BulletinVO vo = new BulletinVO();
		vo.setBbsContent(content);
		vo.setBbsTitle(title);
		vo.setBbsWriter(writer);
		
		BulletinService service = new BulletinServiceImpl();
		service.insertBulletin(vo);

		return "/bulletinList.do";
	}

}
