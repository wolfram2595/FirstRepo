public class Tutorial  { // incepe clasa
    public static void main(String[] args) { // incepe metoda main
/*
        float f1 = 35e1f; // "e" dintre numere inseamna 10, cifra de dupa  arata cate zerouri iar "f" vine de la float intimp ce "d" vine de la double
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);

        char x = 36;
        System.out.println("Bo"+x+x+"!");

        int a = 5;
        a &= 3;
        System.out.println(a);
*/
/*        int rnr = (int)(Math.random()*101);
        System.out.println(rnr);*/

        /*int timp = -10;
        if (timp <= 0){
            System.out.println("Ora nu poate fi negativa sau 0. Introdu o ora valida.");
        } else if (timp <= 12){
            System.out.println("Buna dimineata stapane. Sper ca ti-ai luat micul dejun.");
        } else if (timp <= 18){
            System.out.println("Buna ziua onorabile. spor la $$!");
        } else if (timp <=24) {
            System.out.println("Noapte buna venerabile. Vise umede!");
        } else {
            System.out.println("Unde doamne iarta-ma ai invatat sa citesti ceasul? Cu baietii de la salubris?");
        }*/
        // working if else if statement

        // simple if else statement
        /*int nr = -11;
        if (nr >= 0){
            System.out.println("Numarul este pozitiv.");
        } else {
            System.out.println("Numarul este negativ.");
        }*/

        // simplified if else
        /*int nr = -10;
        String rezultat = (nr > 0) ? "Numarul este pozitiv": "Numarul este negativ";
        System.out.println(rezultat);*/

        // Java For Loop
        // Cand cunosti exact de cate ori vrei sa treci prin loop
        // Foloseste un for loop in loc de un while loop
        /*for (int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }*/

        // nested loops
        // este posibil sa plasam un loop intr-un alt loop iar asta se numeste nested loops
        // outer loop
        /*for (int i = 1; i <= 2; i++){
            System.out.println("-------------");
            System.out.println("Outer: " + i);

            // inner loop
            for (int j = 1; j <= 3; j++){
                System.out.println("Inner: " + j);
            }
        }*/

        // exista un for each loop, care este folosit exclusiv pentru a trece prin elementele dintr-un array
        /*for (type variableName : arrayName) {
            // bloc de cod
        }*/
        String [] cars = {"Volvo", "BMW", "Mercedes-Benz", "Volkswagen"};
        for (String i : cars){
            System.out.println(i);
        }
    } // se termina metoda main
} // se termina clasa
