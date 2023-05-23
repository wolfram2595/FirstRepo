package w3schools.com;

public class w3schoolsMethods {
    static void definitieMetode(){
        /* Metodele sunt blocuri de cod care ruleaza atunci cand sunt folosite
           Putem transmite date, cunoscute ca si parametri intr-o metoda.
           Folosim metodele la anumite actiuni si mai poarta denumirea de functii.
           De ce sa folosim metode? Ca sa reutilizam codul: Definim o singura data codul si il folosim ori de cate ori vrem.
         */

        /* Metodele trebuie declarate intr-o clasa.
           Sunt definite cu numele metodei urmat de paranteze rotunde ().
           Java ofera unele metode pre-definite cum ar fi System.out.println()
         insa putem sa ne creeam propriile metode.
         */
        // Exemplu explicat
        /* - definitieMetode() este numele metodei, iar pe viitor cand vrem sa folosim metoda ne vom folosi de acest nume
           - static inseamna ca metoda apartine clasei w3schoolsMethods si nu unui obiect al clasei w3schoolsMethods
           Invatam mai multe despre obiecte si cum sa accesam metode prin obiecte mai tarziu.
           - void inseamna ca aceasta metoda nu returneaza nici-o valoare.
           Invatam mai multe despre returnarea valorilor mai tarziu in capitolul acesta.
         */

        System.out.println("Am definit ce este o metoda");
    }

    public static void main(String[] args) {
        /* Cum folosim o metoda
           Pentru a folosi o metoda in Java, scrie numele metodei urmata de paranteze rotunde () si inchide cu ;
         */
        // In urmatorul exemplu, definitieMetode() va fi folosit sa printam un text cand va fi chemat:
        definitieMetode();
        // Astfel textul din metoda va fi printat si il putem folosi de ori cate ori dorim
        definitieMetode();
        definitieMetode();
    }
}
