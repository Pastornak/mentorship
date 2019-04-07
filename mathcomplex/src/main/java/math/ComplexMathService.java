package math;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class ComplexMathService {

    @WebMethod
    public double multiply(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a * b;
    }

    @WebMethod
    public double divide(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a / b;
    }
}
