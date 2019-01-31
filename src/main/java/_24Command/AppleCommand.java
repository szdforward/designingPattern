package _24Command;

/**
 * Created by Administrator on 下午 10:25.
 */
public class AppleCommand extends Command {
    public AppleCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sail() {
        peddler.sailApple();
    }
}
