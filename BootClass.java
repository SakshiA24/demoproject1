package org.cap.demo;

public class BootClass{
        public static void main(String args[]){
             for(int i=`;i<10;i++)
                System.out.println(i);
              printMessage("Capgemini");
        }
        
        public static void printMessage(String msg){
            for(int i=1;i<=msg.length();i++)
                System.out.println(msg.substring(0,i));
        }
}
