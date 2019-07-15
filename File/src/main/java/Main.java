import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("======================================");
        System.out.println("Menu:\n1. Write file\n2. Read file\n0. Exit");
        System.out.println("Enter your selection: ");
        int selection;
        do{
            selection = new Scanner(System.in).nextInt();
        }
        while(selection < 0|| selection >2);

        if (selection == 1){
            writeFile();
        }
        else if(selection == 2){
            readFile();
        }
        else{
            System.out.println("Bye!");
            System.exit(0);
        }
    }

    private static void readFile() {
        System.out.println("Message:");
        Object data = ReadAndWriteFile.readFile("E:\\file.txt");
        String mess = (String) data;
        System.out.println(mess);
    }

    private static void writeFile() {
        System.out.println("Enter you message: ");
        String mess = new Scanner(System.in).nextLine();
        boolean kq = ReadAndWriteFile.writeFile(mess, "E:\\file.txt");
        if (kq) System.out.println("Write done!");
        else System.out.println("Write fail!");
    }

    public static void main(String[] args) {
        while (true){
            menu();
        }
    }
}
