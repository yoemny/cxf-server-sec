package firstcode.com.cxf_server_sec;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

