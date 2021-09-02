package create;

import exception.Task0555Exception;
import task.Task0;

public class Task0555 {
    public Task0 task555(String documentNumber) throws Task0555Exception {
        if (documentNumber.toLowerCase().startsWith("555")) {
           return new Task0();
        } else {
            throw new Task0555Exception("Number document haven't 555"+documentNumber);
        }
    }
}
