package FindSanta;

import java.util.Scanner;

public class santaFinder {

    public static void main(String[] args){

        SantaSuspects santaSuspects = new SantaSuspects(15);

        santaSuspects.addSuspect("Bob Bezanga");
        santaSuspects.addSuspect("Sally Zimmerman");
        santaSuspects.addSuspect("Peter Robinson");
        santaSuspects.addSuspect("Hayao Miyazaki");
        santaSuspects.addSuspect("Helen Montego");
        santaSuspects.addSuspect("Gal Gado");
        santaSuspects.addSuspect("Kayla Rodriguez");
        santaSuspects.addSuspect("Matt Palamos");
        santaSuspects.addSuspect("Yoko Ono");
        santaSuspects.addSuspect("Big Show");
        santaSuspects.addSuspect("Doug Dimmadome");

        System.out.println("Provide a name to search for: ");
        Scanner scanner = new Scanner(System.in);
        String searchFor = scanner.nextLine();

        boolean foundMatch = santaSuspects.foundMatch(searchFor);
        if (foundMatch){
            System.out.println(searchFor + " is indeed a santa suspect");
        } else {
            System.out.println(searchFor + " is not a santa suspect");
        }
    }
}
