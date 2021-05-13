package jbk.by.kiran.farmlaw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringStringAPI {
	
@RequestMapping("/hell")
public String stringData()
{
	return "Hii";
	}


@RequestMapping("/state")
String giveFarmersStates() {
	return "hydrabad";
}

@GetMapping("/hello")
public String hello() {
return "Hello world";
}
//7. Post String value
@PostMapping("/poststring")
public String getString(@RequestBody String post)
{
System.out.println(post);
return "Value added successfully!";
//give input e.g. hello world
}
}
