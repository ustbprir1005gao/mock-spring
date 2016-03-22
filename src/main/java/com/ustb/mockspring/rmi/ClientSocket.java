package com.ustb.mockspring.rmi;

import java.net.Socket;

/**
 * Created by ustbgao on 15-8-26.
 */
public class ClientSocket {
    private Socket clientSocket = null;
    private static int port = 0;
    private static String hostName;
    static {
        port = 9999;
        hostName = "localhost";
        System.out.println("外部类的静态代码块开始进行调用");
    }

    public Socket getClientSocket() {
        return clientSocket;
    }

    public void setClientSocket(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        ClientSocket.port = port;
    }

    public static String getHostName() {
        return hostName;
    }

    public static void setHostName(String hostName) {
        ClientSocket.hostName = hostName;
    }

    static class InnerClass{
        private int port = 0;
        private String hostName = null;

        static {
            System.out.println("内部静态类的静态块开始初始化");
            System.out.println("外部类的属性的值是:" + ClientSocket.hostName);
        }
        public static void staticMethod(){
            System.out.println("内部静态类的静态方法可是调用");
        }
        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public String getHostName() {
            return hostName;
        }

        public void setHostName(String hostName) {
            this.hostName = hostName;
        }
    }
    interface AnnoymousInterface{
        public void annoymousMethod();
    }
    public static AnnoymousInterface getAnnoymousInterfaceInstance(){
        return new AnnoymousInterface() {
            @Override
            public void annoymousMethod() {
                System.out.println("匿名内部类的方法开始进行调用");
            }
        };
    }
    public static void main(String [] args){
        ClientSocket.InnerClass.staticMethod();
        System.out.println("内部静态类的调用完成");
        ClientSocket.getAnnoymousInterfaceInstance().annoymousMethod();
    }
}
