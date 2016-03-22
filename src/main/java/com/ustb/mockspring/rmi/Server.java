package com.ustb.mockspring.rmi;

import com.ustb.mockspring.bean.SerializeBean;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ustbgao on 15-8-26.
 */
public class Server {
    public static void main(String [] args){
       /* InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(true){
            try {
                Socket socket = serverSocket.accept();
                inputStream = socket.getInputStream();
                objectInputStream = new ObjectInputStream(inputStream);
                try {
                    SerializeBean serializeBean = (SerializeBean)objectInputStream.readObject();
                    System.out.println("服务器端接收到客户端发送的对象字节流是:" + serializeBean.getId() + " " + serializeBean.getName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
