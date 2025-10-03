import java.util.Scanner;

public class Skola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Skicka objekt till frågaBytaNamn metoden

            //Studenter objekt + Variabler
            Studenter s1 = new Studenter();
            s1.namn = "Oliwer";
            s1.ålder = 17;
            s1.betyg = "C";
            s1.klass = "2:1";
            s1.talId = 1;

            Studenter s2 = new Studenter();
            s2.namn = "Charlie";
            s2.ålder = 25;
            s2.betyg = "E";
            s2.klass = "2:2";
            s2.talId = 2;

            Studenter s3 = new Studenter();
            s3.namn = "Nisse";
            s3.ålder = 12;
            s3.betyg = "F";
            s3.klass = "2:3";
            s3.talId = 3;

            //Lärare objekt + Variabler
            Lärare l1 = new Lärare();
            l1.namn = "Harald";
            l1.ålder = 56;
            l1.ämne = "Fysik";
            l1.lön = 46000;
            l1.talId = 1;

            Lärare l2 = new Lärare();
            l2.namn = "Martin";
            l2.ålder = 33;
            l2.ämne = "Programmering";
            l2.lön = 50000;
            l2.talId = 2;

            Lärare l3 = new Lärare();
            l3.namn = "Jessica";
            l3.ålder = 43;
            l3.ämne = "Historia";
            l3.lön = 36000;
            l3.talId = 3;

            //Vaktmästare objekt + Variabler
            Vaktmästare v1 = new Vaktmästare();
            v1.namn = "Sixten";
            v1.ålder = 6;
            v1.avdelning = "Idrottshallen";
            v1.lön = 14000;
            v1.talId = 1;

            Vaktmästare v2 = new Vaktmästare();
            v2.namn = "Sebastian";
            v2.ålder = 60;
            v2.avdelning = "Nya Skolan";
            v2.lön = 42000;
            v2.talId = 2;

            Vaktmästare v3 = new Vaktmästare();
            v3.namn = "Tobias";
            v3.ålder = 41;
            v3.avdelning = "Gammla Skolan";
            v3.lön = 35000;
            v3.talId = 3;

        //Avsluta programmet
        boolean avsluta=false;

        while (!avsluta) {
            //Presentera(Sout)
            s1.presentera();
            s2.presentera();
            s3.presentera();

            l1.presentera();
            l2.presentera();
            l3.presentera();

            v1.presentera();
            v2.presentera();
            v3.presentera();

            avsluta = frågaBytaNamn(input, s1, s2, s3, l1, l2, l3, v1, v2, v3);
        }

    }

    public static boolean frågaBytaNamn(Scanner input, Studenter s1, Studenter s2, Studenter s3, Lärare l1, Lärare l2, Lärare l3, Vaktmästare v1, Vaktmästare v2, Vaktmästare v3){
        System.out.println("\nVill du byta namn på någon student/anställd eller avsluta programmet? J/N.");

        String avsluta = input.nextLine();

        if (avsluta.equalsIgnoreCase("j")){

            System.out.println("Vem vill du byta namn på? s1, l1, v1 osv:");

            //Variabler för nya namn
            String nyttStudentNamn;
            String nyttLärareNamn;
            String nyttVaktmästareNamn;

            String val = input.nextLine();
            switch (val){
                case "s1":
                    System.out.println("Nytt namn för student:");
                    nyttStudentNamn = input.nextLine();
                    s1.bytaNamn(nyttStudentNamn);
                    break;

                case "s2":
                    System.out.println("Nytt namn för student:");
                    nyttStudentNamn = input.nextLine();
                    s2.bytaNamn(nyttStudentNamn);
                    break;

                case "s3":
                    System.out.println("Nytt namn för student:");
                    nyttStudentNamn = input.nextLine();
                    s3.bytaNamn(nyttStudentNamn);
                    break;

                case "l1":
                    System.out.println("Nytt namn för lärare:");
                    nyttLärareNamn = input.nextLine();
                    l1.bytaNamn(nyttLärareNamn);
                    break;

                case "l2":
                    System.out.println("Nytt namn för lärare:");
                    nyttLärareNamn = input.nextLine();
                    l2.bytaNamn(nyttLärareNamn);
                    break;

                case "l3":
                    System.out.println("Nytt namn för lärare:");
                    nyttLärareNamn = input.nextLine();
                    l3.bytaNamn(nyttLärareNamn);
                    break;

                case "v1":
                    System.out.println("Nytt namn för vaktmästare:");
                    nyttVaktmästareNamn = input.nextLine();
                    v1.bytaNamn(nyttVaktmästareNamn);
                    break;

                case "v2":
                    System.out.println("Nytt namn för vaktmästare:");
                    nyttVaktmästareNamn = input.nextLine();
                    v2.bytaNamn(nyttVaktmästareNamn);
                    break;

                case "v3":
                    System.out.println("Nytt namn för vaktmästare:");
                    nyttVaktmästareNamn = input.nextLine();
                    v3.bytaNamn(nyttVaktmästareNamn);
                    break;

            }

        } else if (avsluta.equalsIgnoreCase("n")) {
            return true;
        } else {
            System.out.println("Ogiltigt svar! Försök igen.");
        }
        return false;
    }



}