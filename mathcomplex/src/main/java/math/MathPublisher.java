package math;

import javax.xml.ws.Endpoint;

public class MathPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/complex-math", new ComplexMathService());
    }
}
