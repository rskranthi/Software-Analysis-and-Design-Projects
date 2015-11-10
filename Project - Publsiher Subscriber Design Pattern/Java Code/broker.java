import java.lang.reflect.Array;
import java.util.*;


public class broker {
    private Map<String,Subscriber> mapOfSubscribers;

    public broker(){
        mapOfSubscribers=new HashMap<String, Subscriber>();
    }

    public void addSubscriber(String name,String productType){
        Subscriber subscriber=getSubscriber(name);
        subscriber.addToListOfSubscritions(productType);
        dispatchEvent(subscriber.getEventType(),subscriber.getSender(),subscriber.getProductTypes(),null,null);
    }

    public void removeSubscriber(String name,String productType){
        Subscriber subscriber=getSubscriber(name);
        subscriber.removeFromListOfSubscribers(productType);
        dispatchEvent(subscriber.getEventType(),subscriber.getSender(),subscriber.getProductTypes(),null,productType);
    }

    private Subscriber getSubscriber(String name){
        Subscriber subscriber;
        if(mapOfSubscribers.containsKey(name)){
            subscriber=mapOfSubscribers.get(name);
        }
        else{
            subscriber=new Subscriber(name);
            mapOfSubscribers.put(name,subscriber);
        }
        return subscriber;
    }

    public void publish(String name,String productType,String productName){
        Publisher publisher=new Publisher(name,productType,productName);
        dispatchEvent(publisher.getEventType(),publisher.getSender(),publisher.getProductTypes(),publisher.getProductNames(),null);
    }

    public void dispatchEvent(String eventType,String sender,ArrayList<String> productTypes,ArrayList<String> productNames,String extras){
        if(eventType.equals("Subscription")){
            System.out.println(sender+" subscribed for"+Arrays.toString(productTypes.toArray()));
        }
        if(eventType.equals("Unsubscription")){
            System.out.println(sender+" unsubscribed "+extras+",s current subscriptions are "+Arrays.toString(productTypes.toArray()));
        }
        if(eventType.equals("Publishing")){
            Iterator i=mapOfSubscribers.entrySet().iterator();
            while(i.hasNext()){
                Map.Entry pair=(Map.Entry)i.next();
                Subscriber subscriber= (Subscriber)pair.getValue();
                if(subscriber.getListOfSubscriptions().contains(productTypes.get(0))){
                    subscriber.update(sender,productTypes.get(0),productNames.get(0));
                }
            }
        }
    }
}
