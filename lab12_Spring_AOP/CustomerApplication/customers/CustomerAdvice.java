package customers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class CustomerAdvice {
    @After("execution(public void customers.EmailSender.sendEmail(String,String)) && args(email, message)")
    public void logEmailSender(JoinPoint joinPoint, String email, String message) {
//        System.out.println("EmailSender: sending '" + message + "' to " + email);
        // a) Reconfigure the application so that whenever the sendMail method on the EmailSender is called,
        // a log message is created (using an after advice AOP annotation)
        System.out.println(new Date() + " method = " + joinPoint.getSignature().getName());

        // b) Now change the log advice in such a way that the email address and the message are logged as well.
        // You should be able to retrieve the email address and the message through the arguments of the sendEmail() method.
        System.out.println(new Date() + " method = " + joinPoint.getSignature().getName() +
                " address=" + email +
                " message=" + message);

        // c) Change the log advice again, this time so that the outgoing mail server is logged as well.
        // The outgoingMailServer is an attribute of the EmailSender object,
        // which you can retrieve through the joinpoint.getTarget() method.
        System.out.println(new Date() + " method = " + joinPoint.getSignature().getName() +
                " address=" + email +
                " message=" + message +
                " outgoing mail server=" + ((EmailSender)joinPoint.getTarget()).getOutgoingMailServer());

    }
}
