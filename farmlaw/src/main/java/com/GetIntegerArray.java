package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetIntegerArray {
@GetMapping("/arrays")
public int[]ArrayAPI3(){
int array[]= {10,20,40};
return array;
}

}
