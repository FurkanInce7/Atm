import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String userName, password;
        int right =3;
        double balance = 1500;
        int select;
        int price;
        Scanner input= new Scanner(System.in);

        System.out.println("Please your username: ");
        userName = input.nextLine();
        System.out.println("Please your password: ");
        password = input.nextLine();

        while (right >0 ){
            if (userName.equals("patika") && (password.equals("dev123"))){
                System.out.println("Welcome to Kodluyoruz Bank");
                do {
                    System.out.println("1- Para yatirma\n" +
                            "2- Para cekme\n" +
                            "3- Check money\n" +
                            "4- Quit"
                    );
                    System.out.println("Please select your process: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("How much money you want to put: ");
                        price = input.nextInt();
                        balance += price;
                    }else if (select ==2){
                        System.out.println("How much money you want to get: ");
                        price= input.nextInt();
                        balance -= price;
                        if (price >balance){
                            System.out.println("You dont have enough money in your account!!");
                        }
                    }else if (select ==3 ){
                        System.out.println(balance);
                    }
                }while (select != 4);
                    System.out.println("You logged out safely!");
                break;

            }else {
                right --;
                System.out.println("Username or password is wrong!! Try it again.");
                if (right == 0){
                    System.out.println("Your account is blocked!! Please contact with the bank!");
                }else{
                    System.out.println("You have "+right +"right!");
                }
            }
        }
    }
}
