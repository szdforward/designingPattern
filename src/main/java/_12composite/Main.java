package _12composite;

import java.util.List;

/**
 * Created by Administrator on 下午 11:16.
 * 组合模式
 */
public class Main {
    public static void main(String[] args) {
        IFile rootFile=new Folder("c:");
        IFile level1File=new File("szd.txt");
        IFile level1Folder=new Folder("szd");
        IFile level2File1=new File("szd2.txt");
        IFile level2File2=new File("szd3.txt");
        rootFile.add(level1File);
        rootFile.add(level1Folder);
        level1Folder.add(level2File1);
        level1Folder.add(level2File2);
        descFile(rootFile, 0);
        System.out.println();
        descFile(level1File,0);
    }
    public static void descFile(IFile iFile,int spaceNum){
        for(int i=0;i<spaceNum;i++){
            System.out.print("--");
        }
        //首先打印名字
        iFile.desc();
        List<IFile> child = iFile.getChild();
        //当不为null的时候进行遍历，为null时说明iFile一开始就是个文件
        if(child!=null){
            for(IFile file:child){
                if(file instanceof File){
                    for (int i = 0; i <= spaceNum; i++) {
                        System.out.print("--");
                    }
                    file.desc();
                }else{
                    descFile(file,spaceNum+1);
                }
            }
        }


    }
}
