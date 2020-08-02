package com.sr.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper{
	HttpServletRequest request;
	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}
	
	public String getParameter(String paramName) {
		String paramValue = request.getParameter(paramName);
		if (paramName.equals("uemail")) {
			if (!paramValue.endsWith("@dss.com")) {
				paramValue = paramValue + "@dss.com";
			}
		}
		if (paramName.equals("umobile")) {
			if (!paramValue.startsWith("91-")) {
				paramValue = "91-" + paramValue;
			}
		}
		return paramValue;
	}
	

}
