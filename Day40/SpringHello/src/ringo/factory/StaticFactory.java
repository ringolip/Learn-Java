package ringo.factory;

import ringo.bean.Airplain;

/**
 * 静态工厂
 * @author ringo
 *
 */
public class StaticFactory {
//	StaticFactory.getAirplain()
	public static Airplain getAirplain(String captionName) {
		System.out.println("StaticFactory正在造飞机...");
		
		Airplain airplain = new Airplain();
		airplain.setCaptainName(captionName);
		airplain.setEngine("太行");
		airplain.setPersonNum(300);
		airplain.setWingLength(198);
		
		return airplain;
		
	}
}
