package bank;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class DAOAdvice {
    @After("execution(public * bank.dao.*.*(..))")
    public void log(JoinPoint joinPoint) {
        System.out.println(new Date() + " method = " + joinPoint.getSignature().getName());
    }
}
