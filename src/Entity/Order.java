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
public class Order {
    private String OrderID;
    private Date dateMor;
    private PSP psp;
    private Customer customer;

    public Order(String OrderID, Date dateMor, PSP psp, Customer customer) {
        this.OrderID = OrderID;
        this.dateMor = dateMor;
        this.psp = psp;
        this.customer = customer;
    }

    public Order() {
    }

    public String getOrderID() {
        return OrderID;
    }

    public Date getDateMor() {
        return dateMor;
    }

    public PSP getPsp() {
        return psp;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public void setDateMor(Date dateMor) {
        this.dateMor = dateMor;
    }

    public void setPsp(PSP psp) {
        this.psp = psp;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.OrderID);
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
        final Order other = (Order) obj;
        return Objects.equals(this.OrderID, other.OrderID);
    }
    
    
}
