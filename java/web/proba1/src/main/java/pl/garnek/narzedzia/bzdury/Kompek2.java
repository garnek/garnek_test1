package pl.garnek.narzedzia.bzdury;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Kompek2 {
	
	@Resource
	private Kompek1 kompek1;
	
	@PostConstruct
	private void zainicjowany () {
		System.out.println(this.getClass().getSimpleName());
	}
}
