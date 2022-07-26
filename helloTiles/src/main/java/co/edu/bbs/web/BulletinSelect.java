package co.edu.bbs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.bbs.service.BulletinService;
import co.edu.bbs.serviceImpl.BulletinServiceImpl;
import co.edu.bbs.vo.BulletinVO;
import co.edu.common.Control;

public class BulletinSelect implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		System.out.println("cont: " + id);

		BulletinVO vo = new BulletinVO();
		vo.setBbsId(Integer.parseInt(id));

		BulletinService service = new BulletinServiceImpl();
		vo = service.bulletinSelect(vo);

		request.setAttribute("bulletin", vo);

		return "bbs/bulletin.tiles";
	}

}
