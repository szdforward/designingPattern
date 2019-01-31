package _24Command;

/**
 * Created by Administrator on 下午 10:29.
 * 命令模式：有一个老大，只管发送命令，执行的事情他不做，让这个命令的子类来进行，命令中含有执行者，让在这个执行者来做
 */
public class Main {
    public static void main(String[] args) {
        Peddler peddler = new Peddler();
        Master master = new Master();
        AppleCommand appleCommand = new AppleCommand(peddler);
        master.addCommand(appleCommand);
        master.addCommand(new BananaCommand(peddler));
        master.execute();
        System.out.println("---------------");
        //老板发话了，不卖苹果了，移除掉卖苹果的命令
        master.removeCommand(appleCommand);
        master.execute();

    }
}
