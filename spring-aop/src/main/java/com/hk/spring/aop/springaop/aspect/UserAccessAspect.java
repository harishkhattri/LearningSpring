package com.hk.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// execution(* PACKAGE.*.*(..)) means
	// execution(<any return type> PACKAGE.<any class>.<any methods>(<any kind
	// of arguments>))
	// this expression is called Point Cut

	// The combination of Advice and Point Cut is called Aspect

	// The spring AOP framework ensures that the point cut is executing at right
	// moment. This process is called Weaving and the framework which
	// implements this process is called Weaver

	// A specific execution interception is called Join Point
	@Before("com.hk.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		// Advice means what should I do. This logic is called advice.
		logger.info(" Check for user access ");
		logger.info(" Allowing execution for -  {}", joinPoint);
	}
}
