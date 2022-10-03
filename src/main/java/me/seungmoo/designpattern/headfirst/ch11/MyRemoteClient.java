package me.seungmoo.designpattern.headfirst.ch11;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try {
            // rmi 레지스트리에서 lookup 기능을 제공
            // lookup기능을 수행하는 lookup메서드는 RMI 스텁 객체를 리턴한다.
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String s = service.sayHello();

            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
