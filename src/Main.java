import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\n");
    boolean Exit = false ;
    int Options ;

    SchoolPersonalAgenda ScPiersAgenda = new SchoolPersonalAgenda(250);
    String name ;
    int id ;

    Contacts c;

    while (!Exit) {

        System.out.println("1. ADD NEW STUDENT OR TEACHER CONTACT");
        System.out.println("2. SEE ALL CONTACTS");
        System.out.println("3. SEARCH CONTACTS");
        System.out.println("4. LIST DATA BASE1");
        System.out.println("5. DELETE STUDENT");
        System.out.println("6. MEMORY AVAIBLE CONTACTS");
        System.out.println("7. CHECK IF YOU CAN ADD MORE PERSONS  ");
        System.out.println("8. Exit");
        try {
            System.out.println(" PLEASE CHOOSE A OPTION");
            Options = sc.nextInt();

            switch (Options) {
                case 1:
                    System.out.println(" ADD A STUDENT OR TEACHER NAME");
                    name = sc.next();

                    System.out.println("ADD ID NUMBER");
                    id = sc.nextInt();



                    c = new Contacts(name, id );
                    ScPiersAgenda.addContacts(c);

                    break;

                case 2:
                    ScPiersAgenda.showAllContacts();
                    break;

                case 3:
                    System.out.println("CONTACT NAME :");
                    name = sc.next();

                    ScPiersAgenda.searchByName(name);
                    break;

                case 4:
                    System.out.println("CONTACT NAME :");
                    name = sc.next();

                    c = new Contacts(name, 0);

                    if (ScPiersAgenda.existContacts(c)) {
                        System.out.println("CONTACT EXIST ");
                    }else {
                        System.out.println("CONTACT DOSEN'T EXIST");
                    }

                    break;

                case 5:
                    System.out.println("CONTACT NAME :");
                    name = sc.next();
                    c = new Contacts(name,0);
                    ScPiersAgenda.deleteContact(c);

                    break;


                case 6:

                    System.out.println("NUMBER OF MEMORY CONTACTS AVAIBLE :" + ScPiersAgenda.freeContactSpace());
                    break;
                case 7:
                    if (ScPiersAgenda.agendaFull()){
                        System.out.println("FULL MEMORY OF AGENDA");
                    }else {
                        System.out.println("YOU CAN ADD MORE CONTACTS");
                    }
                    break;
                case 8:
                    Exit = true;
                    break;
                default:
                    System.out.println("ONLY NUMBERS BETWEEN 1 AND 8");
            }
        }catch (InputMismatchException e){
            System.out.println("YOU MUST ENTER ONLY NUMBERS");
            sc.next();
        }
    }
}
}
