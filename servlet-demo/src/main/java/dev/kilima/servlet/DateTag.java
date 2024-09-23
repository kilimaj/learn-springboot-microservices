package dev.kilima.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	private String pattern = null;
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public int doStartTag() throws JspException {
	
		JspWriter out = pageContext.getOut();
		
		try {
			out.println(new Date().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	
	

}
