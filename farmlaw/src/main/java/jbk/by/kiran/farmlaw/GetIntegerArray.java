package jbk.by.kiran.farmlaw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetIntegerArray {
@GetMapping("/array")
public int[]ArrayAPI3(){
int array[]= {10,20,30,40,50};
return array;
}

}
