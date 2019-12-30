package org.sid.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletResponse;

@Component
public class LogFilter  extends ZuulFilter  {


   // public Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();

        response.setStatus(200);
        System.out.println("ok ok");

        return null;

    }


}

