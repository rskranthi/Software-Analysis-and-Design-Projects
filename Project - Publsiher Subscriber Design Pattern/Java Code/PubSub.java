import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class PubSub {
    public static void main(String[] args) throws IOException{
        String fileName="";
        String token="";
        String tempVal="";
        broker broker=new broker();
        //If commandline args are not present show a file chooser
        //or else take the cmd line arg as filename
        if(args.length==0){
            JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                fileName=chooser.getSelectedFile().getAbsolutePath();
                System.out.println("You chose to open the file: " +
                        fileName);
            }
        }
        else{
            fileName=args[0];
        }

        Scanner reader = new Scanner(new FileInputStream(fileName));
        String dataRow =reader.nextLine();
        dataRow.trim();
        while(reader.hasNextLine()){
            //System.out.println(dataRow);
            String[] tokens=dataRow.split(",");
            for(int i=0;i<tokens.length;i++){
                tokens[i]=tokens[i].trim();
                if(i>1) {
                    tokens[i] = tokens[i].toLowerCase();
                }
            }
            //System.out.println(Arrays.toString(tokens));
            if(tokens[0].equals("Subscribe")){
                broker.addSubscriber(tokens[1],tokens[2]);
            }

            if(tokens[0].equals("Unsubscribe")){
                broker.removeSubscriber(tokens[1],tokens[2]);
            }

            if(tokens[0].equals("Publish")){
                broker.publish(tokens[1],tokens[2],tokens[3]);
            }
            dataRow=reader.nextLine();
            dataRow.trim();
        }
    }
}
