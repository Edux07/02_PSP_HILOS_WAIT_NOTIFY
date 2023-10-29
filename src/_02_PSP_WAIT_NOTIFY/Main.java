package _02_PSP_WAIT_NOTIFY;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		EmailBuffer buffer = new EmailBuffer(null, null);
		Productor p1= new Productor("Productor1", buffer);
		Productor p2= new Productor("Productor2", buffer);
		Productor p3= new Productor("Productor1", buffer);
		
	}

}
