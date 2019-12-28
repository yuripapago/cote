package yuripapago.designpattern.singleton;

public class Singleton {
    private Singleton() {
        System.out.println("instance construct");

    }

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
