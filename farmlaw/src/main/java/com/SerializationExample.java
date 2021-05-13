package com;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) throws IOException {
		
	
  Student ss=new Student();
  ss.setAge(23);
  ss.setLocation("pune");
  FileOutputStream fos=new FileOutputStream("abcd.txt");
  ObjectOutputStream oos =new ObjectOutputStream(fos);
  oos.writeObject(ss);
  
 
}
}  