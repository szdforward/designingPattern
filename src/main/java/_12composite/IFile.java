package _12composite;

import java.util.List;

/**
 * Created by Administrator on 下午 11:17.
 */
public interface IFile {

    public void desc();

    public boolean add(IFile iFile);

    public boolean remove(IFile iFile);

    public List<IFile> getChild();
}
