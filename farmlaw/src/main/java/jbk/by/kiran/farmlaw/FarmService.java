package jbk.by.kiran.farmlaw;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FarmService {
	@Autowired
	FarmDao fd;
	public HashSet<Integer> getAllLaws() {
		HashSet<Integer> hs=new HashSet<>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(50);
	return (hs);	}
}
