package org.zstack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zstack.header.rest.RESTConstant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xing5 on 2016/12/7.
 */
@Controller
public class RestServerController {
    @Autowired
    private RestServer server;

    @RequestMapping(
            value = RestConstants.API_VERSION,
            method = {
                    RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.GET,
                    RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.PATCH, RequestMethod.TRACE
            }
    )
    public void api(HttpServletRequest request, HttpServletResponse response) throws IOException {
        server.handle(request, response);
    }
}
