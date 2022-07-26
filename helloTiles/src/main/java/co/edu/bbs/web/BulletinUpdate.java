package co.edu.bbs.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.bbs.service.BulletinService;
import co.edu.bbs.serviceImpl.BulletinServiceImpl;
import co.edu.bbs.vo.BulletinVO;
import co.edu.common.Control;

public class BulletinUpdate implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String id = request.getParameter("id");

		BulletinVO vo = new BulletinVO();
		vo.setBbsTitle(title);
		vo.setBbsContent(content);
		vo.setBbsId(Integer.parseInt(id));

		BulletinService service = new BulletinServiceImpl();
		service.updateBulletin(vo);

		service = new BulletinServiceImpl();
		List<BulletinVO> list = service.bulletinSelectList();

		request.setAttribute("list", list);

		return "bbs/bbsList.tiles";
	}

}
