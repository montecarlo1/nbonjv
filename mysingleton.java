/**
 * Created by ubuneclipse on 2/15/17.
 */
public class mysingleton {
    private static mysingleton ourInstance = new mysingleton();

    public static mysingleton getInstance() {
        return ourInstance;
    }

    private mysingleton() {
    }
}
