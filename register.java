import java.util.Scanner;

public class register{
    public User user;

    register(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama");
        String nama = input.nextLine();
        System.out.println("Masukkan username");
        String username = input.nextLine();
        System.out.println("Masukkan password");
        String password = input.nextLine();

        user.setter(nama, username, password);
    }
    
}
