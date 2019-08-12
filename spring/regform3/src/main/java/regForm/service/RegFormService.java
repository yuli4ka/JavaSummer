package regForm.service;

import org.springframework.stereotype.Service;
import regForm.dto.NoteDTO;
import regForm.exceptions.SameLoginException;
import regForm.notebook.Notebook;

@Service
public class RegFormService {

  public void inputNote(NoteDTO noteDTO) throws SameLoginException {
    if (Notebook.containsLogin(noteDTO.getLogin())) {
      throw new SameLoginException("uuuu", "");
    }

  }
}
