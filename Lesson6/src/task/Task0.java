package task;

import exception.Task0555Exception;
import exception.Task0abcException;
import exception.Task1a2bException;

public class Task0 {
    public static void main(String[] args) {
        try {
            String documentNumber = "3243-dfr-2384-dhf-2h4h";
            System.out.println("Number document" + documentNumber);
            System.out.println(documentNumber.substring(0, 4) + "-" + documentNumber.substring(9, 13));
            System.out.println(documentNumber.replace("abc", "каждая буква заменятся на") + " " + documentNumber.replace("dhf", "каждая буква заменятся на"));
            System.out.println(documentNumber.toLowerCase().substring(5, 8) + "/" + documentNumber.toLowerCase().substring(14, 17) + "/" + documentNumber.toLowerCase().charAt(19) + "/" + documentNumber.toLowerCase().charAt(21));
            StringBuffer let = new StringBuffer();
            let.append("Letters:");
            System.out.println("\"" + let + documentNumber.toUpperCase().substring(5, 8) + "/" + documentNumber.toUpperCase().substring(14, 17) + "/" + documentNumber.toUpperCase().charAt(19) + "/" + documentNumber.toUpperCase().charAt(21) + "\"");

            if (documentNumber.toUpperCase().contains("abc".toUpperCase())) {
                System.out.println("Number document have abc");
            } else {
                System.out.println("Number document haven't abc");
            }

            if (documentNumber.toLowerCase().startsWith("555")) {
                System.out.println("Number document have 555");
            } else {
                System.out.println("Number document haven't 555");
            }

            if (documentNumber.toLowerCase().endsWith("1a2b")) {
                System.out.println("Number document have 1a2b");
            } else {
                System.out.println("Number document haven't 1a2b");
            }
        }catch (Task0abcException e){
            System.err.println("Exception! Not found abc"+e);
        } catch (Task0555Exception e){
            System.err.println("Exception! Not found 555"+e);
        }catch (Task1a2bException e){
            System.err.println("Exception! Not found 1a2b"+e);
        }catch (Exception e){
            System.out.println("Exception!"+e);
        }
    }
}
