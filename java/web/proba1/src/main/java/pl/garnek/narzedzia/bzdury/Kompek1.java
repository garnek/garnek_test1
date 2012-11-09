package pl.garnek.narzedzia.bzdury;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Kompek1 {
	
	@PostConstruct
	private void zainicjowany () {
		System.out.println(this.getClass().getSimpleName());
	}
}
