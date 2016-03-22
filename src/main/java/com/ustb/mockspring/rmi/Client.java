package com.ustb.mockspring.rmi;

import com.ustb.mockspring.bean.SerializeBean;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by ustbgao on 15-8-26.
 */
public class Client {
    public static void main(String [] args){
        /*Socket client = new Socket();
        InetSocketAddress address = new InetSocketAddress("localhost" , 9999);
        InputStream inputStream = null;
        ObjectOutputStream objectOutputStream = null;
        OutputStream outputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            client.connect(address , 6000);
            inputStream = client.getInputStream();
            outputStream = client.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            SerializeBean serializeBean = new SerializeBean();
            serializeBean.setId(123);
            serializeBean.setName("gaoqi");
            objectOutputStream.writeObject(serializeBean);


        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
