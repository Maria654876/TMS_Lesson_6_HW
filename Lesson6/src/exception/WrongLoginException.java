package exception;

public class WrongLoginException extends Exception{
     public WrongLoginException() {

    }

    WrongLoginException(String s) {
        s="Error! Not valid login";
    }
}
