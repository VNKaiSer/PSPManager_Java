/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author DatPC
 */
public class Customer {

    private String cusID;
    private String name;
    private int rank;
    private String address;
    private Date dateIn;

    public Customer(String cusID, String name, int rank, String address, Date dateIn) {
        this.cusID = cusID;
        this.name = name;
        this.rank = rank;
        this.address = address;
        this.dateIn = dateIn;
    }

    public Customer() {
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public String getCusID() {
        return cusID;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public String getAddress() {
        return address;
    }

    public Date getDateIn() {
        return dateIn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.cusID);
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
        final Customer other = (Customer) obj;
        return Objects.equals(this.cusID, other.cusID);
    }

}
