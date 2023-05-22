public class w3schools { // incepe clasa
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
        /*String [] cars = {"Volvo", "BMW", "Mercedes-Benz", "Volkswagen"};
        for (String i : cars){
            System.out.println(i);
        }*/

        // java break and continue
        // am vazut deja afirmatia break in exemplele cu for.
        // acolo l-am folosit sa sarim dintr-o fraza switch
        // dar afirmatia break poate fi folosita si sa sarim dintr-un loop
        // exemplul de jos opreste loop-ul atunci cand i este egal cu 4
        /*for (int i = 0; i < 10; i++){
            if (i == 4){
                break;
            }
            System.out.println(i);
        }*/
        // expresia continue rupe o repetare dintr-un loop daca conditia specificata este atinsa
        // si continua cu urmatoarea repetare din loop
        // exemplul acesta sare peste valoarea 4 so continua loop-ul
        // astfel va returna 0,1,2,3,5,6,7,8,9
        /*for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }*/
        // break and continue in while loop
        // expresiile break si continue pot fi folosite si in while loops
        /*int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
            if (i == 4){
                break;
            }
        }*/
        // se va returna 0,1,2,3
        /*int i = 0; // declaram integerul i = 0
        while (i < 10){ // atata timp cat i este mai mic decat 10 continua loop-ul
            if (i == 4){ // daca i este egal cu 4 atunci
                i++; // creste valoarea lui i cu 1
                continue; // scoate conditia din loop si continua loop-ul
            }
            System.out.println(i); // printeaza-i valoarea lui i
            i++; // creste valoarea lui i cu 1
        }*/
        // initial i va fi 0 deci este mai mic decat 10 si va continua loop-ul
        // ajungem la if si conditia nu este indeplinita fiindca i nu este egal cu 4
        // sarim peste if si ajungem la final unde printam valorea lui i si ii crestem valoarea cu 1
        // loop-ul o ia de la capat
        // cand i ajunge la valoarea egala cu 4 intra in blocul de cod a lui if
        // aici ii creste o data valoarea lui i cu 1 astfel i devine 5
        // continua loop-ul neprintand conditia adevarata
        // il printeaza pe 5 si ii creste valoarea lui i cu 1
        // loop-ul o ia de la capat pana ajunge sa printeze 9
        // dupa ce a printat 9 i se creste valoarea lui i cu 1 iar cand loop-ul incepe de la capat
        // i nu mai este mai mic decat 10 astfel se opreste loop-ul
        
    } // se termina metoda main
} // se termina clasa
