package File;

import sun.rmi.transport.StreamRemoteCall;

import java.io.*;
import java.util.Scanner;

public class Main {
    public void readFile(){

        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(new FileReader("C:\\tmp\\file.txt"));
            String contentline = bufferedReader.readLine();
            while(contentline != null){
                System.out.println(contentline);
                contentline = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void writeFile(){

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try{
            System.out.println("Enter the content: ");
            String content = new Scanner(System.in).nextLine();

            fileWriter = new FileWriter("C:\\tmp\\file.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);

            System.out.println("Done.");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(bufferedWriter != null)
                    bufferedWriter.close();
                if(fileWriter != null)
                    fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        int selection;

        do{
            System.out.println("==================================================");
            System.out.println("1.Readfile\n2.Writefile");
            System.out.println("choose the selection:");

            selection = new Scanner(System.in).nextInt();

            switch (selection){

                case 1:
                    System.out.println("==================================================");
                    main.readFile();
                    break;

                case 2:
                    System.out.println("==================================================");
                    main.writeFile();
                    break;

                case 0:
                    return;
            }
        }while(selection != 0);
    }
}
