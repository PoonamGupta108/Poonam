package jbk.by.kiran.farmlaw;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FarmController {
	
@Autowired
FarmService farmService;
@GetMapping("/farmlaws")

public HashSet<Integer> getfarmlaw(){

	return farmService.getAllLaws();
	
}
}
