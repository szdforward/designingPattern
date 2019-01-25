package _10Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 下午 5:08.
 * 动态代理-对方法增强-不修改原先方法的基础上
 */
public class Main {
    public static void main(String[] args) {
        SellBookMan sellBookMan=new SellBookMan();
        Sellbook proxySellbook=(Sellbook)Proxy.newProxyInstance(sellBookMan.getClass().getClassLoader(), sellBookMan.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("卖书前你得先营销");
                Object result = method.invoke(sellBookMan, args);
                System.out.println("然后你最好在给个优惠券");
                return result;
            }
        });
        proxySellbook.sellBook();
    }
}
