package org.campus02.oop;

public class DemoApp {

	public static void main(String[] args) {
		
		PersonManager pm = new PersonManager();
		for (int i= 0; i < 1000; i++){
			pm.add(createTestPerson());
		}

		GenderAnalyzer ga = new GenderAnalyzer();
		pm.doAnalysis(ga);

		CountryAnalzyer ca = new CountryAnalzyer();
		pm.doAnalysis(ca);
		System.out.println(ca.getResult());

		pm.doAnalysis(new MaxSalaryAnalyzer());

		BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();
		pm.doAnalysis(bmiAnalyzer);
		System.out.println(bmiAnalyzer.getResult());
	}
	
	
	public static Person createTestPerson()
	{
		String[] firstnames = new String[] {"John", "Max", "Susi", "Georg", "Gerald", "Michael", "Steve", "J�rg", "Sebastian", "Louis", "Thomas", "Tom", "Sandra", "Beate", "Birgit"};
		String[] lastnames = new String[] {"Muster", "Doe", "Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth"};
		String[] eyeColors = new String[] {"blau", "braun", "gr�n", "gelb"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI"};
		char[] genders = new char[] {'M', 'F'};
		
		Person p = new Person(
				getRandom(firstnames), getRandom(lastnames), 
				getRandom(genders), 
				(int) (Math.random()* 100.0), 
				getRandom(countries), (int) (Math.random() * 5900) + 1000, 
				getRandom(eyeColors), (int) (Math.random() * 50) + 50,
				(int)(Math.random() * 50) + 160);
		
		
	
		return p;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
	
	public static char getRandom(char[] arr)
	{
		return arr[(int) (Math.random() * 100) % arr.length];		
	}
	
}
