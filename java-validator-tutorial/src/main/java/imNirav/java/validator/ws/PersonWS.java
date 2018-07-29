package imNirav.java.validator.ws;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import imNirav.java.validator.vo.PersonVO;

@RestController
public class PersonWS {

	@PostMapping("/save/person")
	public ResponseEntity<?> savePerson(@Valid @RequestBody PersonVO person,BindingResult result){
		
		if(result.hasErrors()) {
			FieldError field = result.getFieldError();
			String error = field.getField()+", "+field.getDefaultMessage();
			return new ResponseEntity<>(error,HttpStatus.PRECONDITION_FAILED);
		}
		return new ResponseEntity<>(person,HttpStatus.OK);
	}
}
