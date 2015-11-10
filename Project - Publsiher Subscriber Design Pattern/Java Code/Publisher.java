import java.util.ArrayList;


public class Publisher implements Event {
    private String mName="";
    private ArrayList<String> mProductTypes;
    private ArrayList<String> mproductNames;

    //constructor
    public Publisher(){}
    public Publisher(String name){
        mName=name;
        mProductTypes=new ArrayList<String>();
        mproductNames= new ArrayList<String>();
    }
    public Publisher(String name,String productType,String productName){
        mName=name;
        mProductTypes=new ArrayList<String>();
        mproductNames= new ArrayList<String>();
        addToList(mproductNames,productName);
        addToList(mProductTypes,productType);
    }

    public void addToList(ArrayList<String> list, String item){
        if(!list.contains(item)){
            list.add(item);
        }
    }
    //getter setter for mName
    public String getName(){return mName;}
    public void  setName(String name){mName=name;}


    @Override
    public String getSender() {
        return mName;
    }

    @Override
    public String getEventType() {
        return "Publishing";
    }

    @Override
    public ArrayList<String> getProductTypes() {
        return mProductTypes;
    }

    @Override
    public ArrayList<String> getProductNames() {
        return mproductNames;
    }
}
