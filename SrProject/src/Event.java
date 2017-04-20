/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author cornonsta
 */
public class Event {
    String name;
    String phone;
    String email;
    String tunnel;
    String rtime;
    String date;
    String time;
    String timeP;
    String interval;
    String slot1;
    String slot12;
    String slot2;
    String slot23;
    String slot3;
    String slot34;
    String slot4;
    String slot45;
    String slot5;
    String slot56;
    String slot6;
    String slot67;
    String slot7;
    String slot78;
    String slot8;
    String slot89;
    String slot9;
    String slot90;
    String slot10;
    String slot01;
    String slot11;
    ArrayList<String> timeSlots;
    
        public Event(String _name, String _phone, String _e, String _t,
                    String _rt, String _d, String _time) {
            name = _name;
            phone = _phone;
            email = _e;
            tunnel = _t;
            rtime = _rt;
            date = _d;
            time = _time;
            slot1 = "11:00 am";
            slot12 = "11:30 am";
            slot2 = "12:00 pm";
            slot23 = "12:30 pm";
            slot3 = "1:00 pm";
            slot34 = "1:30 pm";
            slot4 = "2:00 pm";
            slot45 = "2:30 pm";
            slot5 = "3:00 pm";
            slot56 = "3:30 pm";
            slot6 = "4:00 pm";
            slot67 = "4:30 pm";
            slot7 = "5:00 pm";
            slot78 = "5:30 pm";
            slot8 = "6:00 pm";
            slot89 = "6:30 pm";
            slot9 = "7:00 pm";
            slot90 = "7:30 pm";
            slot10 = "8:00 pm";
            slot01 = "8:30 pm";
            slot11 = "9:00 pm";
            
            
        }

    Event() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList getTimeSLots(){
         timeSlots = new ArrayList<String>();
            //HashMap<Date, Time> event = new HashMap<Date, Time>();
            
            timeSlots.add(slot1);
            timeSlots.add(slot12);
            timeSlots.add(slot2);
            timeSlots.add(slot23);
            timeSlots.add(slot4);
            timeSlots.add(slot45);
            timeSlots.add(slot5);
            timeSlots.add(slot56);
            timeSlots.add(slot6);
            timeSlots.add(slot67);
            timeSlots.add(slot7);
            timeSlots.add(slot78);
            timeSlots.add(slot8);
            timeSlots.add(slot89);
            timeSlots.add(slot9);
            timeSlots.add(slot90);
            timeSlots.add(slot10);
            timeSlots.add(slot01);
            timeSlots.add(slot11);
        return timeSlots;
    }
    public String getName() {
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
       
    }
    public String getTunnel(){
        return tunnel;
    }
    public String getRentalTime(){
        return rtime;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){
        return time;
    }
    public String getTime1(){
    	
    	for(int i = 0; i < timeSlots.size(); i++)
    	{
    		timeP = timeSlots.get(i + 1).toString();
    	}
        return timeP;
    }
    public String getInterval() {
    	return interval;
    }
    public void setInterval(String _int) {
    	interval = _int;
    }
    
}
