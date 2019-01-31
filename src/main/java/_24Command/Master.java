package _24Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 下午 10:27.
 */
public class Master {
    public List<Command> commands=new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command){
        commands.remove(command);
    }

    public void execute(){
        for (Command command : commands) {
            command.sail();
        }
    }

}
