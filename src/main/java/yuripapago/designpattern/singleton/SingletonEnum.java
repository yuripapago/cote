package yuripapago.designpattern.singleton;


public enum SingletonEnum {
    INSTANCE;
    static String init = "";

    public static SingletonEnum getInstance() {
        init = "test";
        return INSTANCE;
    }
}
