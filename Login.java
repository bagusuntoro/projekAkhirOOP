import java.util.Scanner;

public class Login{
    
    public void sigin(User user){
        Scanner input = new Scanner(System.in);

        System.out.print("\nusername\t:");
        String username = input.next();
        System.out.print("password\t:");
        String password = input.next();

        String usss =user.getUsername();
        String pass =user.getPassword();


        if (usss==username && pass==password) {
            System.out.println("success");
            // return true;
        }else{
            // new register();
            // return false;
            System.out.println("gagal");

        }

    }

}