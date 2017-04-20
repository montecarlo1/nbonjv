import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;

/**
 * Created by ubuneclipse on 2/15/17.
 */
public interface Consumer2 {
    public void run();
    public void handleConsumeOk(String consumerTag);
    public void handleDelivery(String consumerTag, Envelope env, AMQP.BasicProperties props, byte[] body);
}
