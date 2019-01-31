package _24Command;

/**
 * Created by Administrator on 下午 10:24.
 */
public abstract class Command {
    protected Peddler peddler;

    public Command(Peddler peddler) {
        this.peddler = peddler;
    }
    public abstract void sail();
}
