package aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
/**
 * 增强处理类*/
public class aopAdvice {
    private static Logger logger= Logger.getLogger(aopAdvice.class);
    /**
     * 前置增强
     * */
    public void before(JoinPoint joinPoint){
        /**
         * 获取前端传来参数对象数组用Object[] 数组接收*/
       Object[] object=joinPoint.getArgs();
       /**
        * 创建StringBuffer用来接收传过来的参数数组元素用于拼接*/
        StringBuffer stringBuffer=new StringBuffer();
       /**
        * 循环遍历每个参数的名字是什么*/

       for (int i=0;i<object.length;i++){
           String obj=(String) object[i];
           stringBuffer.append(obj);
           stringBuffer.append(",");
       }
       /**
        * 在logger.info输出stringBuffer对象里的参数*/
        logger.info("前置调用"+joinPoint.getTarget()+"的方法"+
                        joinPoint.getSignature().getName()+
                        "方法参数是："+
                Arrays.toString(joinPoint.getArgs())+
                "个，前端传过来的没给参数名字是："+stringBuffer);

    }
    /**
     * 后置增强
     * */
    public void afterRetuning(JoinPoint joinPoint,Object result){
        logger.info("后置调用"+joinPoint.getTarget()+"的方法"+
                joinPoint.getSignature().getName()+
                "方法返回值："+ result);
    }
    /**
     * 异常增强
     * */
    public void throwingException(JoinPoint joinPoint,RuntimeException e){
        logger.error("异常增强调用"+joinPoint.getTarget()+"的方法"+
                joinPoint.getSignature().getName()+"发生异常"+
                e);
    }
    /**
     * 最终增强
     * */
    public void after(JoinPoint joinPoint){
        logger.error("最终增强调用"+joinPoint.getTarget()+"的方法"+
                joinPoint.getSignature().getName()+"方法执行结束");
    }
    /**
     * 环绕增强
    * */
    public  Object  around(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("环绕增强调用"+joinPoint.getTarget()+"的方法"+
                joinPoint.getSignature().getName()+
                "方法参数是："+ Arrays.toString(joinPoint.getArgs()));
        Object result;
        try {
            result=joinPoint.proceed();
            logger.info("环绕增强调用"+joinPoint.getTarget()+"的方法"+
                    joinPoint.getSignature().getName()+
                    "方法返回值："+ result);
            return result;
        } catch (Throwable e) {
            logger.error(joinPoint.getSignature().getName()+"发生异常"+e);
           throw  e;
        }finally {
            logger.info(joinPoint.getSignature().getName()+"方法执行结束");

        }

    }
}
