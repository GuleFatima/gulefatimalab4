/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.*;

/**
 *
 * @author GUL E FATIMA
 */
public class Slots {
    private String start_time;
    private String end_time;
    LinkedList<pojoclass> linkedlist = new LinkedList<pojoclass>();

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public LinkedList<pojoclass> getLinkedlist() {
        return linkedlist;
    }

    public void setLinkedlist(LinkedList<pojoclass> linkedlist) {
        this.linkedlist = linkedlist;
    }
    
    
}
