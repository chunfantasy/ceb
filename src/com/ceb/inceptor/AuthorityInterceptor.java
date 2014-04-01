package com.ceb.inceptor;





import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor {
     

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String intercept(ActionInvocation invocation) throws Exception {
        
        ActionContext ctx = invocation.getInvocationContext();
        Map session = (Map) ctx.getSession();
        //未登录，返回输入
        if(((java.util.Map<String, Object>) session).get("user")==null){
            return "input";
        }
        //否则通过拦截
        return invocation.invoke();
    }
   


}

	
