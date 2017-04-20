/**
 * Created by ubuneclipse on 2/13/17.
 */
public class Producer extends Thread implements Runnable{
    private Buffer buffer;
    private int start;
    public Producer(Buffer b, int s)
    {
        buffer = b;
        start = s;
    }
    public void run(){
        for(int i = start; i < start + 100; i++){
            buffer.put(i);
        }
    }
}
