package _10Proxy.interfaceProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于接口的动态代理
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
		 Actor actor = new Actor();
//		actor.basicAct(300);
//		actor.dangerAct(1000);
		//基于接口的动态代理  生成一个基于接口的代理对象
        IActor proxyActor= (IActor) Proxy.newProxyInstance(actor.getClass().getClassLoader(), actor.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object object=null;
                float money= (float) args[0];
                if(method.getName().equals("basicAct")){
                    //基础的表演，大于2w才演出，经纪公司拿一半的钱
                    if(money>20000){
                        object=method.invoke(actor,money/2);
                    }
                }
                if (method.getName().equals("dangerAct")) {
                    //危险的表演，大于10w才演出，经纪公司拿一半的钱
                    if(money>100000){
                        object=method.invoke(actor, money/2);
                    }
                }
                return object;
            }
        });
        //proxyActor.basicAct(10000f);
        //proxyActor.dangerAct(50000f);
        proxyActor.basicAct(70000f);
        proxyActor.dangerAct(500000f);

    }
}
//实现InvocationHandler接口，如何代理  基于接口的动态代理
/*class myInvocationHandler implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}*/
