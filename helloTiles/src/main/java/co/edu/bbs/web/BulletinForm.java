package co.edu.bbs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Control;

public class BulletinForm implements Control {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return "bbs/bbsForm.tiles";
	}

}
