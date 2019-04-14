package bank.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Timing implements InvocationHandler {
    private final Object object;

    public Timing(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = method.invoke(object, args);
        System.out.println("Executing " + method.getName() + " took " + (System.currentTimeMillis() - start));
        return result;
    }
}
