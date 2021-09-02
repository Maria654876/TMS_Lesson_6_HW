package create;

import exception.Task0abcException;
import task.Task0;

class TaskabcExcep {
    public Task0 abc(String documentNumber) throws Task0abcException {
      if (documentNumber.toUpperCase().contains("abc")) {
          return new Task0();
      } else{
          throw new Task0abcException("Number document haven't abc"+documentNumber);
      }
    }
}
