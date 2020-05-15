package ringo.factory;

import org.springframework.beans.factory.FactoryBean;

import ringo.bean.Airplain;

/**
 * 实现了FactoryBean接口的类是Spring可以认识的工厂类
 * Spring会自动调用工厂方法创建实例
 * @author ringo
 *
 */
public class MyFactoryBeanImpl implements FactoryBean<Airplain>{

	/**
	 * getObject：工厂方法;
	 * 返回创建的对象
	 */
	@Override
	public Airplain getObject() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyFactoryBeanImpl正在造飞机...");
		
		Airplain airplain = new Airplain();
		airplain.setCaptainName("Kaka");
		airplain.setEngine("太行");
		airplain.setPersonNum(300);
		airplain.setWingLength(198);
		
		return airplain;
	}

	/**
	 * 返回创建的对象类型
	 * Spring会自动调用这个方法来确认创建的对象是什么类型
	 */
	@Override
	public Class<Airplain> getObjectType() {
		// TODO Auto-generated method stub
		return Airplain.class;
	}

	/**
	 * isSingleton：是单例吗
	 * false：不是单例
	 */
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
