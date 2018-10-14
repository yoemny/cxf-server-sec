
package firstcode.com.cxf_server_sec;

import javax.jws.WebService;

@WebService(endpointInterface = "firstcode.com.cxf_server_sec.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

