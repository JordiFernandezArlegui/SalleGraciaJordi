import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String entrada=input.nextLine();
        switch(entrada) {
            case "Coratge":
                System.out.println("Gryffindor");
                break;

                case "Coneixement":
                    System.out.println("Ravenclaw");
                    break;

                    case "Ambicio":
                        System.out.println("Slytherin");
                break;
                default:
                System.out.println("Hufflepuff");

        }
    }
    }
