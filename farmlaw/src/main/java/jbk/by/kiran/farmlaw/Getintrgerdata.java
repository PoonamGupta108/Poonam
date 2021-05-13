package jbk.by.kiran.farmlaw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Getintrgerdata {
	
	@GetMapping("/invalue")
	public int IntAPI2() {
	return 10;
	}
}