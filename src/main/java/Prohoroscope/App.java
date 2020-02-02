package Prohoroscope;

import java.io.IOException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("podaj dane!");
        String znak = scan.next();

        String requestResult = Connector.getPage(znak);
        String horoscopeMess = " ";
        if (!requestResult.equals(Connector.NOT_FOUND)) {
         horoscopeMess = HOROSCOPEXTRACTOR.getText(requestResult);
        }
        System.out.println(horoscopeMess);


    }
    }
