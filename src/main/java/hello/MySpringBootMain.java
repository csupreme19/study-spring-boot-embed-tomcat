package hello;

import hello.boot.MySpringApplication;

@MySpringBootApplication
public class MySpringBootMain {

    public static void main(String[] args) {
        MySpringApplication.run(MySpringBootMain.class, args);
    }

}
