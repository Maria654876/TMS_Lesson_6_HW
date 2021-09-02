package task;

import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception{
     Register d=new Register();
     d.login="jahdfvbhdv";
     d.password="kdfjn1";
     d.confirmPassword="kdfjn1";

    }

      static class Register{
        private String login;
        private String password;
        private String confirmPassword;

        public void test() throws WrongLoginException, WrongPasswordException {
            System.out.println("Enter login");
            Scanner console=new Scanner(System.in);
            String login=console.nextLine();
            System.out.println("Enter password");
            String password=console.nextLine();
            System.out.println("Enter confirmPassword");
            String confirmPassword=console.nextLine();
            boolean e = false;

            if (login.contains(" ") || login.length()>20){
                System.out.println("Exception! Login have spaces or login>20");
            }else{
                System.out.println("Login enter");
              throw new WrongLoginException();
            }
            if (password.contains(" ") || password.length()>20 || !password.matches(".*\\d.*")){
                System.out.println("Exception! Password have spaces or password>20 or password haven't numbers");
                throw new WrongPasswordException();
            }else {
                System.out.println("Password enter");
            }
            if (confirmPassword!=password){
                System.out.println("Exception! Confirmpassword don't equal password");
                throw new WrongPasswordException();
            } else {
                System.out.println("Confirmpassword valid");
            }
        }
    }
}
