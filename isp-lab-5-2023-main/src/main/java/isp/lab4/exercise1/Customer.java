/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise1;

/**
 *
 * @author Cata
 */
public class Customer {
    private String customerId;
    private String name;
    private String phone;

    public Customer(String customerid, String name, String phone) {
        this.customerId = customerid;
        this.name = name;
        this.phone = phone;
    }

    public String getCustomerid() {
        return customerId;
    }

    public void setCustomerid(String customerid) {
        this.customerId = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
