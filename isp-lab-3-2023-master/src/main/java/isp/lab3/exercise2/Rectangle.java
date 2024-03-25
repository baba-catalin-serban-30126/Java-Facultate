/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise2;

/**
 *
 * @author Cata
 */
public class Rectangle {
     private int lenght;
        private int width;
        private String color;
        public int area;
        public int perimeter;

        public Rectangle() {
            lenght=2;
            width=1;
            color="red";
        }

        public int getLenght() {
            return lenght;
        }

        public int getWidth() {
            return width;
        }

        public String getColor() {
            return color;
        }

        public int getArea() {
            area= lenght*width;
            return area;
        }

        public int getPerimeter() {
            perimeter=2*lenght+2*width;
            return perimeter;
        }
        
    }

