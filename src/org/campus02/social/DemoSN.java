package org.campus02.social;

public class DemoSN {

	public static void main(String[] args) {
		
		SocialNetwork sn = SocialNetwork.generateDemoNetwork();
		
		//TODO 1: geben Sie alle User des Social Networks basierend
		//auf Ihrer geschriebenen .toString() Methode aus
		for (User u : sn.getUsers()){
			System.out.println(u);
		}
		//System.out.println(sn.getUsers().toString());

		User sofia = sn.getUsers().get(7);
		System.out.println(sofia);

		System.out.println("\n");
		//TODO 2: probieren Sie die implementierte rekursive Methode
		//der Klasse SocialNetwork für verschiedene Benutzer und
		//Werte für maxDepth aus.
		System.out.println(
				sn.findAllFriends(sofia, 0, 3));

		System.out.println(
				sn.findAllFriends2(sofia, 0, 3));
	}
	
}
