package _10Proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 基于子类的动态代理 涉及的类Enhancer  涉及的方法：create（Class，Callback）
 * 模拟一个剧组
 * @author
 *
 */
public class Client {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
        Actor actor=new Actor();
        //此处我们不使用CallBack接口，我们使用CallBack的子接口MethodInterceptor
        Actor actorProxy = (Actor) Enhancer.create(actor.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object object = null;
                float money = (float) args[0];
                if (method.getName().equals("basicAct")) {
                    //基础的表演，大于2w才演出，经纪公司拿一半的钱
                    if (money > 20000) {
                        object = method.invoke(actor, money / 2);
                    }
                }
                if (method.getName().equals("dangerAct")) {
                    //危险的表演，大于10w才演出，经纪公司拿一半的钱
                    if (money > 100000) {
                        object = method.invoke(actor, money / 2);
                    }
                }
                return object;
            }
        });
        actorProxy.basicAct(50000f);
    }
}
