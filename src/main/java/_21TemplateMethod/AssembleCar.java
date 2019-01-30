package _21TemplateMethod;

/**
 * Created by Administrator on 上午 6:28.
 */
public abstract class AssembleCar {
    public abstract void assembleHead();

    public abstract void assembleBody();
    public abstract void assembleTail();
    public void assembleAll(){
        assembleHead();
        assembleBody();
        assembleTail();
        System.out.println("组装完成！");
    }

}
