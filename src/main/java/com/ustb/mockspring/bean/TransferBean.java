package com.ustb.mockspring.bean;

import java.io.*;

/**
 * 可以传输的序列化BEAN
 * Created by ustbgao on 15-8-26.
 */
public class TransferBean implements Serializable {
    static{
        System.out.println("在这里可以添加初始化的代码");
    }
    private static final long serialVersionUID = 23354599999L;
    private int userID;
    private String userName;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public static void main(String [] args){
        TransferBean transferBean = new TransferBean();
        transferBean.setUserID(123);
        transferBean.setUserName("gaoqi");
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("e:/serialize.obj"));
            outputStream.writeObject(transferBean);
        } catch (IOException e) {
            e.printStackTrace();
        }
        TransferBean unserializeBean = null;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("e:/serialize.obj"));
            try {
                unserializeBean = (TransferBean)inputStream.readObject();
                System.out.println("反序列化的对象中的属性值是:" + unserializeBean.getUserID() + " " + unserializeBean.getUserName());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
