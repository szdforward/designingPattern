package _10Proxy.cglib;

/**
 * 一个演员
 * @author
 *
 */
public class Actor {
	
	/**
	 * 基本的表演
	 * @param money
	 */
	public void basicAct(float money){
		System.out.println("拿到钱，开始基本的表演："+money);
	}
	
	/**
	 * 危险的表演
	 * @param money
	 */
	public void dangerAct(float money){
		System.out.println("拿到钱，开始危险的表演："+money);
	}
}
