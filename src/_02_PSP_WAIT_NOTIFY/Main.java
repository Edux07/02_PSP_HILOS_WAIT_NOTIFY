package _02_PSP_WAIT_NOTIFY;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		EmailBuffer buffer = new EmailBuffer(null, null);
		Productor p1 = new Productor("Productor1", buffer);
		Productor p2 = new Productor("Productor2", buffer);
		Productor p3 = new Productor("Productor1", buffer);

		Consumidor c1 = new Consumidor("Consumidor1", buffer);
		Consumidor c2 = new Consumidor("Consumidor2", buffer);
		
		c1.start();
		c2.start();
		
		p1.start();
		p2.start();
		p3.start();
	}

}
