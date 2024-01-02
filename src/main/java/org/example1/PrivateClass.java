package org.example1;

public class PrivateClass {

    private static class SubPrivateClass {
private void getName(String name){
    System.out.println("name is  + '%%' " + name);
}

    }
    protected static class SubProtectedClass {
public void test(){
SubPrivateClass subPrivateClass = new SubPrivateClass();
subPrivateClass.getName("test class");
}
    }

}

class MainApp {
    public static void main(String[] args) {
        PrivateClass.SubProtectedClass privateClass = new PrivateClass.SubProtectedClass();
        privateClass.test();

    }
}
