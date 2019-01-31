package _24Command;

/**
 * Created by Administrator on 下午 10:26.
 */
public class BananaCommand extends Command {
    public BananaCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sail() {
        peddler.sailBanana();
    }
}
