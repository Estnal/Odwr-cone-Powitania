import java.util.Scanner;

public class PersonHello {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 imion: ");


        for (int i = 0; i < persons.length; i++){
            Person person = new Person(scanner.nextLine());
            persons[i] = person;

        }

        for (int i =persons.length -1; i > -1; i--){
            System.out.println("Cześć " + persons[i].getName());


        }



    }
}
