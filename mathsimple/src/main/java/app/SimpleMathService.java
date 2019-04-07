package app;

import com.sun.xml.internal.ws.developer.SchemaValidation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@SchemaValidation
public class SimpleMathService {

    @WebMethod
    public int getOperation(@WebParam(name = "operation") String operation, @WebParam(name = "a")int a, @WebParam(name = "b")int b){
        switch (operation){
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                throw new IllegalArgumentException("Operation [" + operation + "] is not recognized. Available operations: +, -");
        }
    }
}
