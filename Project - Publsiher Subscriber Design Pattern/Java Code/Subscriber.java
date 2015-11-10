import java.util.ArrayList;
import java.util.Arrays;


public class Subscriber implements Event{
    private String mName="";
    private ArrayList<String> mListOfSubscriptions;
    private boolean isSubscriptionRemoved=false;
    private boolean isSubscriptionAdded=false;

    //constructors
    public Subscriber(){}
    public Subscriber(String name){
        mName=name;
        mListOfSubscriptions=new ArrayList<String>();
    }
    public Subscriber(String name,String subscription){
        mName=name;
        mListOfSubscriptions=new ArrayList<String>();
        addToListOfSubscritions(subscription);
    }


    //getter setter for mName
    public String getName(){return mName;}
    public void  setName(String name){mName=name;}

    //getter for mListOfSubscriptions
    public ArrayList<String> getListOfSubscriptions(){return mListOfSubscriptions;}

    //add method for mListOfSubscriptions
    //checks if the current subscription already exists and if not adds it to mListOfSubscriptions
    public void addToListOfSubscritions(String subscription){
        if(!mListOfSubscriptions.contains(subscription)){
            mListOfSubscriptions.add(subscription);
            isSubscriptionAdded=true;
        }
        else{
            System.out.println(mName+" already subscribed for "+subscription);
        }
    }

    public void removeFromListOfSubscribers(String subscription){
        if(!mListOfSubscriptions.isEmpty()){
            mListOfSubscriptions.remove(subscription);
            isSubscriptionRemoved=true;
        }
    }
    //updates the subscriber if a publisher broadcasts an update
    public void update(String sender, String productType, String productName){
        System.out.println(productName+", "+productType+ ", is available from "+sender+" for "+mName);
    }

    //Override methods for the event interface
    @Override
    public String getSender() {
        return mName;
    }

    @Override
    public String getEventType() {
        String eventType="Invalid";
        if(isSubscriptionAdded){
            eventType="Subscription";
        }
        else if(isSubscriptionRemoved){
            eventType="Unsubscription";
        }
        isSubscriptionRemoved=false;
        isSubscriptionAdded=false;
        return eventType;
    }

    @Override
    public ArrayList<String> getProductTypes() {return mListOfSubscriptions;}

    @Override
    public ArrayList<String> getProductNames() {
        return null;
    }
}
