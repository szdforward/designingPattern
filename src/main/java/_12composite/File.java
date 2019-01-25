package _12composite;

import java.util.List;

/**
 * Created by Administrator on 下午 11:19.
 */
public class File implements IFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public void desc() {
        System.out.println(name);
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }
}
