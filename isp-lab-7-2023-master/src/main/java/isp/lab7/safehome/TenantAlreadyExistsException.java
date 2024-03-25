/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author Cata
 */
public class TenantAlreadyExistsException extends Exception {
     
    public TenantAlreadyExistsException(String msg){
     super(msg);   
    }
    
}
