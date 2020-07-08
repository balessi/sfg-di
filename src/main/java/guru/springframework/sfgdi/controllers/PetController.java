package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.PetService;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

	private final PetService petService;

	public PetController(@Qualifier("petService") PetService petService1) {
		super();
		this.petService = petService1;
	}

	public String whichPetIsTheBest() {
		return this.petService.getPetType();
	}
}
