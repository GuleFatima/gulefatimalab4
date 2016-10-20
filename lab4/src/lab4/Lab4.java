
package lab4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import lab4.pojoclass;
import java.util.*;
import lab4.priority_table;

/**
 *
 * @author GUL E FATIMA
 */
public class Lab4 {

   

     public  LinkedList<pojoclass> lab4() {
LinkedList<pojoclass> linkedlist = new LinkedList<pojoclass>();
        String csvFile = "C:\\Users\\TARIQ BUKHARI\\Desktop\\Geolocation.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
 int iteration=0;
            while ((line = br.readLine()) != null) {
               
                
                 if(iteration == 0 || iteration == 1) 
                 {
                  iteration++;  
                  continue;
                 }

                // use comma as separator
                String[] schedule = line.split(cvsSplitBy);
                
                

                // use comma as separat

                //System.out.println("Country [code= " + schedule[0] + " , lat=" + schedule[1] + "]");
                pojoclass p=null;
                //setting parameters of a single object
                p.setStart_date(schedule[0]);
                p.setEnd_date(schedule[1]);
                p.setActivity(schedule[2]);
                
                linkedlist.add(p);
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        

    }
return linkedlist;
    
}
     
     
     
     
     
     
     public  List<priority_table> table_making() {

        String csvFile = "C:\\Users\\TARIQ BUKHARI\\Desktop\\Geolocation.csv";
        String line = "";
        String cvsSplitBy = ",";
        List<priority_table> table_activity = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
 int iteration=0;
            while ((line = br.readLine()) != null) {
               
                
                 if(iteration == 0 || iteration == 1) 
                 {
                  iteration++;  
                  continue;
                 }

                // use comma as separator
                String[] schedule = line.split(cvsSplitBy);
                
                 
                priority_table pt= new priority_table();
//filtering out unique activities
                   if(!table_activity.contains(schedule[2]))
                        {
                            pt.setAct_name(schedule[2]);
                            pt.setAct_priority(0);
                           table_activity.add(pt);
                        } 

        //print activities
  for (int i = 0; i < table_activity.size(); i++)
        {
            System.out.println(i+": " + table_activity.get(i));
        }

                // use comma as separat

               
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        

    }
return table_activity;
    
}
     
}




