package com.ceb.inceptor;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

public class FckeditorUpload extends StrutsPrepareAndExecuteFilter {
	
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException{    
	    HttpServletRequest request = (HttpServletRequest)req;    
	    if("http://localhost:8080/CEB/fckeditor/editor/*".equals(request.getRequestURI())){    
	   chain.doFilter(req,res);    
	   }else{    
	     super.doFilter(req,res,chain);    
	   }    
	}   

	
}
