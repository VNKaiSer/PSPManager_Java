/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Objects;

/**
 *
 * @author DatPC
 */
public class PSP {

    private String pspID;
    private boolean type;
    private double price;
    private boolean status;

    public PSP() {
    }

    public PSP(String pspID, boolean type, double price, boolean status) {
        this.pspID = pspID;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public String getPspID() {
        return pspID;
    }

    public boolean isType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setPspID(String pspID) {
        this.pspID = pspID;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.pspID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PSP other = (PSP) obj;
        return Objects.equals(this.pspID, other.pspID);
    }
    
    private void turnOn(){
        this.status = true;
    }
    
    private void turnOff(){
        this.status = false;
    }

}
