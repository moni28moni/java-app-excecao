import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = null;

        try{
            File file = new File("arquivo.txt");
            scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextInt());
            }
        }catch(NullPointerException | FileNotFoundException ex){
            ex.printStackTrace();
           
        } catch(InputMismatchException ex){
            System.err.println(ex.getMessage());
        } finally{
            scanner.close();
        }

        System.out.println("O programa foi finalizado.");
    }
}
