package regForm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import regForm.dto.NoteDTO;
import regForm.service.RegFormService;

@Slf4j
@RestController
@RequestMapping(value = "/api")
public class RegFormController {

  private final RegFormService regFormService;

  @Autowired
  public RegFormController(RegFormService regFormService) {
    this.regFormService = regFormService;
  }

  @ResponseStatus(HttpStatus.CREATED)
  @RequestMapping(value = "/reg_form", method = RequestMethod.POST)
  public void regFormController(NoteDTO note) {
    System.out.println(note.toString());
  }

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity handleRuntimeException(RuntimeException ex) {
    return new ResponseEntity(HttpStatus.BAD_REQUEST);
  }

}
