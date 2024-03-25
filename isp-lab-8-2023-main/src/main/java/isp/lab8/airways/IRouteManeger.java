/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab8.airways;
import java.util.List;

/**
 *
 * @author Cata
 */
public interface IRouteManeger {
     void createRoute(List<Waypoint> waypoints, String routeName) throws RouteManagementException;
     List<Waypoint> getRoute(String routeName) throws RouteManagementException;
     double getRouteDistance(String routeName)  throws RouteManagementException;
     void deleteRouts(String routeName) throws RouteManagementException;
    
    
}
