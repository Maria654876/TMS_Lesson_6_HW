package create;

import exception.Task0555Exception;
import exception.Task1a2bException;
import task.Task0;

public class Task1a2b {
    public Task0 task1a2b (String documentNumber) throws Task1a2bException{
        if (documentNumber.toLowerCase().startsWith("1a2b")) {
            return new Task0();
        } else {
            throw new Task1a2bException("Number document haven't 1a2b"+documentNumber);
        }
    }
}
