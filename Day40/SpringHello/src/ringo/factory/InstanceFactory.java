package ringo.factory;

import ringo.bean.Airplain;

/**
 * 实例工厂
 * @author ringo
 *
 */
public class InstanceFactory {
//	new InstanceFactory().getAirplain();
	public Airplain getAirplain(String captionName) {
		System.out.println("InstanceFactory正在造飞机...");
		
		Airplain airplain = new Airplain();
		airplain.setCaptainName(captionName);
		airplain.setEngine("太行");
		airplain.setPersonNum(300);
		airplain.setWingLength(198);
		
		return airplain;
		
	}
}
