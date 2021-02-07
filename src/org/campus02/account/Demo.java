package org.campus02.account;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		
		GiroKonto test = new GiroKonto("Hansi Huber", 100);
		System.out.println(test.kontostand);
		test.auszahlen(100);
		System.out.println(test.kontostand);
		System.out.println("--------");
		
		JugendGiroKonto test2 = new JugendGiroKonto("David", 100, 500);
		
		test2.einzahlen(1000);
		System.out.println(test2.kontostand);
		test2.auszahlen(600);
		test2.auszahlen(100);
		System.out.println(test2.kontostand);
		System.out.println("--------");
		
		Konto k = test2; // JugendKonto in Konto casten
		k.auszahlen(600);
		JugendGiroKonto g = (JugendGiroKonto) k; // Achtung!
		
		
		SparKonto test3 = new SparKonto("Matthias");
		
		test3.einzahlen(200);
		System.out.println(test3.kontostand);
		test3.auszahlen(300);
		System.out.println(test3.kontostand);
		test3.auszahlen(200);
		System.out.println(test3.kontostand);
		System.out.println("--------");
		
		Konto k1 = new Konto("Matthias");
		GiroKonto k2 = new GiroKonto("Matthias", 1000);
		JugendGiroKonto k3 = new JugendGiroKonto("Matthias", 1000, 200);
		
		ArrayList<Konto> konten = new ArrayList<>();
		konten.add(test);
		konten.add(test2);
		konten.add(test3);
		konten.add(k1);
		konten.add(k2);
		konten.add(k3);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (Konto konto : konten) {
			if (!map.containsKey(konto.inhaber))
			{
				map.put(konto.inhaber, 1);
			}
			else
			{
				int value = map.get(konto.inhaber);
				map.put(konto.inhaber, value + 1);
			}		
		}
		System.out.println(map);
		
		
		
	}

}
