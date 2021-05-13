package jbk.by.kiran.farmlaw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Abc {
	

		
	@RequestMapping(value="/home", method= RequestMethod.GET)
		public String hello() {
			return "/home";

		}
	
	@RequestMapping(value="/error", method= RequestMethod.GET)
	public String hello1() {
		return "/error";

	}
	

	@GetMapping("/arrays")
	public int[]ArrayAPI3(){
	int array[]= {10,20,30};
	return array;
	}

}
