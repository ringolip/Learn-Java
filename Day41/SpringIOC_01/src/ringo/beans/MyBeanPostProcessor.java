package ringo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	/**
	 * postProcessBeforeInitialization：初始化之前调用
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("初始化之前postProcessBeforeInitialization调用...，传入的beanname为[" 
				+ beanName + "],bean为[" + bean + "]...");
		return bean; // 返回传入的bean
	}

	
	/**
	 * postProcessAfterInitialization：初始化之后调用
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("初始化之后postProcessAfterInitialization调用...，传入的beanname为[" 
				+ beanName + "],bean为[" + bean + "]...");
		return bean;
	}




}
