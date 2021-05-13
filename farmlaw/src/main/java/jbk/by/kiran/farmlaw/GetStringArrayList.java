package jbk.by.kiran.farmlaw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GetStringArrayList {

@GetMapping("/arraylist")
public ArrayList<String> ArrayListAPI4(){
ArrayList<String> arraylist=new ArrayList<>();
arraylist.add("abc");

arraylist.add("pqr");
arraylist.add("str");

return arraylist;
}
//8.Post Integer value
@RequestMapping(value="/postint", method=RequestMethod.POST)
public String getInteger(@RequestBody String post)
{
System.out.println(post);
return "Value added successfully!";
}
//give input e.g. hello world
//9. Put String value
@PutMapping("/putpost")
public String putString1(@RequestBody String post)
{
String value;
value="Hello world"; 
value=post;
System.out.println("Updated value:-"+value);
return "Value updated!";
}
//9. Put String value
@PutMapping("/putpost")
public String putString(@RequestBody String post)
{
String value;
value="Hello world";
value=post;
System.out.println("Updated value:-"+value);
return "Value updated";
}
//10.Put Integer Value
@RequestMapping(value="/putpostint",
method=RequestMethod.PUT)
public String putString(@RequestBody int post)
{
int a;
a=10;
a=post;
System.out.println("Updated value:-"+a);
return "Value updated!";
}

//11. Get Hash set
@GetMapping("/hashsetapi")
public HashSet<Integer> HashSetAPI10()
{
HashSet<Integer> set=new HashSet<>();
set.add(10);
set.add(20);
set.add(5);
return set;
}

//12. Get Treeset
@GetMapping("/treesetapi")
public TreeSet<Integer> TreeSetAPI11()
{
TreeSet<Integer> set=new TreeSet<>();
set.add(10);
set.add(25);
set.add(5);
set.add(60);
set.add(40);
return set;
}
}