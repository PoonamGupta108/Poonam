package jbk.by.kiran.farmlaw;

import java.util.HashSet;

import org.springframework.stereotype.Component;
@Component
public class FarmDao {

	public HashSet<Integer> getAllLaws() {
		//Class.forForm(//arg0)
		//complete jdbc code
		HashSet<Integer> hs=new HashSet<>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(50);
	return (hs);	
	}
}

