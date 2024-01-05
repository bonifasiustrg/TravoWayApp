/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travowayapp;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class TravelData {
       
    private Integer travelId;
    private String location;
    private String status;
    private Double price;
    private Date date;
    
    public TravelData(Integer travelId, String location, String status, Double price, Date date){
        this.travelId = travelId;
        this.location = location;
        this.status = status;
        this.price = price;
        this.date = date;
    }
    
    public Integer getBusId(){
        return travelId;
    }
    public String getLocation(){
        return location;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
}
