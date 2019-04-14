package bank.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Logger implements InvocationHandler {

    private final Object object;

    public Logger(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoked method: " + method.getName()    );
        return method.invoke(object, args);
    }

}
