package com.zhengyun.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;


/**
 * Created by 听风 on 2017/9/28.
 */
public class DataSourceMatch {

    Logger logger = LoggerFactory.getLogger(DataSourceMatch.class);
    public void before(JoinPoint point) throws Throwable {
        Class<?> clazz = point.getTarget().getClass().getInterfaces()[0];

        Object [] args = point.getArgs();
        Class<?>[] parameterTypes = ((MethodSignature)point.getSignature()).getParameterTypes();

        String methodName = point.getSignature().getName();

        Method interfaceMethod = clazz.getMethod(methodName,parameterTypes);

        DataSource dataSource = interfaceMethod.getAnnotation(DataSource.class);
        String key = dataSource == null?"master" : dataSource.value();
        logger.info("curent dataSource:" + key);
        MutiDataSource.key.set(key);
    }
}
