import org.apache.commons.lang.SerializationUtils;
import java.io.IOException;
import java.io.Serializable;


//jar download:  http://www.java2s.com/Code/Jar/a/Downloadapachecommonslangjar.htm
/**
 * Created by ubuneclipse on 2/15/17.
 */
public class Producer2 extends EndPoint{
    public Producer2(String endPointName) throws IOException {
        super(endPointName);
    }

    public void sendMessage(Serializable object) throws IOException {
        channel.basicPublish("",endPointName, null, SerializationUtils.serialize(object));
    }
}
