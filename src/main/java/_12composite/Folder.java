package _12composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 下午 11:21.
 */
public class Folder implements IFile {

    List<IFile> list=new ArrayList<IFile>();

    public  String name;

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void desc() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile iFile) {
        return list.add(iFile);
    }

    @Override
    public boolean remove(IFile iFile) {
        return list.remove(iFile);
    }

    @Override
    public List<IFile> getChild() {
        return list;
    }
}
