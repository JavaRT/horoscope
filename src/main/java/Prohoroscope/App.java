package Prohoroscope;

import java.io.IOException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("podaj dane!");
        Scanner scan = new Scanner(System.in);
        String znak = scan.next();

        String requestResult = Connector.getPage(znak);
        if (requestResult.equals(Connector.NOT_FOUND))
        System.out.println(requestResult);


    }
}
