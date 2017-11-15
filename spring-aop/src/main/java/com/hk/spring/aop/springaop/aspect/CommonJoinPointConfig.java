package com.hk.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.hk.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {
	}

	@Pointcut("execution(* com.hk.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {
	}

	@Pointcut("com.hk.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.hk.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {
	}

	@Pointcut("bean(dao*)")
	public void beanStartingWithDao() {
	}

	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {
	}

	@Pointcut("within(com.hk.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {
	}

	@Pointcut("@annotation(com.hk.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {
	}
}
