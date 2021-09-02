package exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){

    }
    WrongPasswordException (String d){
        d="Error! Not valid password";
    }
}
