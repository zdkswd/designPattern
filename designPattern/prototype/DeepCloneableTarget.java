package zdk.prototype;

import java.io.*;

/**
 * 作者：zdk
 * 描述：实现深拷贝
 * 时间: 2019/8/12 10:41
*/
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 2817937048946364195L;

    private String cloneName;

    private String cloneClass;

    public Sheep sheep;//引用类型

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //方式1 使用clone方法,如果引用类型很多，这样处理比较麻烦
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep=null;
        //这里完成对基本数据类型（属性）和String的克隆
        deep=super.clone();
        //对引用类型的属性进行单独处理
        DeepCloneableTarget deepCloneableTarget=(DeepCloneableTarget)deep;
        deepCloneableTarget.sheep=(Sheep) sheep.clone();

        return deepCloneableTarget;
    }
    //方式2 通过对象的序列化实现（推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;

        try{
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出

            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepCloneableTarget deepCloneableTarget=(DeepCloneableTarget)ois.readObject();
            return deepCloneableTarget;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
