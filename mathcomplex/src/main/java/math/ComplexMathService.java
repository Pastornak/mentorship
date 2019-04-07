package math;

import com.sun.xml.internal.ws.developer.SchemaValidation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@SchemaValidation
public class ComplexMathService {

    @WebMethod
    public double multiply(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a * b;
    }

    @WebMethod
    public double divide(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        if(b != 0) {
            return a / b;
        } else{
            throw new IllegalArgumentException("Number to which divide by cannot be 0");
        }
    }
}
