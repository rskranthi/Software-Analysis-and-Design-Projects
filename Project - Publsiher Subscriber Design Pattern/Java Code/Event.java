import java.util.ArrayList;

public interface Event {
    public String getSender();
    public String getEventType();
    public ArrayList<String> getProductTypes();
    public ArrayList<String> getProductNames();
}
