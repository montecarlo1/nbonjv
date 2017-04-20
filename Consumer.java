/**
 * Created by ubuneclipse on 2/13/17.
 */
public class Consumer extends Thread implements Runnable{
    private Buffer buffer;
    public Consumer(Buffer b){
        buffer = b;
    }
    public void run(){
        for(int i = 0 ; i < 100; i++){
            int x = buffer.get();
            System.out.println("got :--------------------------------"+x);
        }
    }
}
