/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_client;



/**
 *
 * @author andre
 */
        
 import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Ticket {
    private String from_station, to_station, from_zone, to_zone;
    private boolean hasEntered, hasExited;


    public Ticket(String from_station, String to_station, String from_zone, String to_zone, boolean hasEntered, boolean hasExited) {
        this.from_station = from_station;
        this.to_station = to_station;
        this.from_zone = from_zone;
        this.to_zone = to_zone;
        this.hasEntered = hasEntered;
        this.hasExited = hasExited;
    }

    public Ticket() {
    }

    public String getFrom_station() {
        return from_station;
    }

    public void setFrom_station(String from_station) {
        this.from_station = from_station;
    }

    public String getTo_station() {
        return to_station;
    }

    public void setTo_station(String to_station) {
        this.to_station = to_station;
    }

    public String getFrom_zone() {
        return from_zone;
    }

    public void setFrom_zone(String from_zone) {
        this.from_zone = from_zone;
    }

    public String getTo_zone() {
        return to_zone;
    }

    public void setTo_zone(String to_zone) {
        this.to_zone = to_zone;
    }

    public boolean isHasEntered() {
        return hasEntered;
    }

    public void setHasEntered(boolean hasEntered) {
        this.hasEntered = hasEntered;
    }

    public boolean isHasExited() {
        return hasExited;
    }

    public void setHasExited(boolean hasExited) {
        this.hasExited = hasExited;
    }
}

