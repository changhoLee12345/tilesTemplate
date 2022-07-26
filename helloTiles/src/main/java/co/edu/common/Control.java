package co.edu.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Control {
	public String execute(HttpServletRequest request, HttpServletResponse response);
}
