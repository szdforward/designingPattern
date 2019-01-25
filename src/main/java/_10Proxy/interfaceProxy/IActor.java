package _10Proxy.interfaceProxy;
/**
 * 一个经纪公司
 * @author
 *
 */
public interface IActor {

	/**
	 * 基本的表演
	 * @param money
	 */
	public void basicAct(float money);
	
	/**
	 * 危险的表演
	 * @param money
	 */
	public void dangerAct(float money);
}
