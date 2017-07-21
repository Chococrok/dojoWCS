/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 *  IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 * ***/
import java.util.*;

public class IsoContest {

	static Scanner sc = new Scanner(System.in);
	static int myN = Integer.valueOf(sc.nextLine());
	static StringBuffer myTeam = new StringBuffer(sc.nextLine());
	static int yourN = Integer.valueOf(sc.nextLine());
	static StringBuffer yourTeam = new StringBuffer(sc.nextLine());
	static StringBuffer bestTeam = new StringBuffer("A");
	static boolean catNeeded = true;

public static void main( String[] argv ) throws Exception {

	
	
	while(myN != 0 || yourN != 0){
		if(yourN == 0){
			bestTeam.setCharAt(0, '+');
			break;
		}
		else if(myN == 0){
			bestTeam.setCharAt(0, '-');
			break;
		}
		else if(yourN == 0 && myN == 0){
			bestTeam.setCharAt(0, '=');
			break;
		}
		if(catNeeded){
			sendNewCat();
		}
		else{
			useSameCat();
		}
		

	}
	System.out.println(bestTeam);

}

private static void sendNewCat(){
	if ( yourTeam.charAt(0) == 'P' && myTeam.toString().contains("F")){
		bestTeam.append('F');
		yourTeam.deleteCharAt(0);
		yourN--;
		catNeeded = false;
	}
	else if ( yourTeam.charAt(0) == 'F' && myTeam.toString().contains("E")){
		bestTeam.append('E');
		yourTeam.deleteCharAt(0);
		yourN--;
		catNeeded = false;
	}
	else if ( yourTeam.charAt(0) == 'E' && myTeam.toString().contains("P")){
		bestTeam.append('P');
		yourTeam.deleteCharAt(0);
		yourN--;
		catNeeded = false;
	}
	else if (myTeam.toString().contains(String.valueOf(yourTeam.charAt(0)))){
		bestTeam.append(yourTeam.charAt(0));
		myTeam.deleteCharAt(myTeam.indexOf(String.valueOf(yourTeam.charAt(0))));
		myN--;
		yourTeam.deleteCharAt(0);
		yourN--;
	}
	else {
		bestTeam.setCharAt(0, '-');
	}
}

private static void useSameCat(){
	if (yourTeam.charAt(0) == 'P' && bestTeam.charAt(bestTeam.length() -1) == 'F'){
		yourTeam.deleteCharAt(0);
		yourN--;
	}
	
	else if(yourTeam.charAt(0) == 'E' && bestTeam.charAt(bestTeam.length() -1) == 'P'){
		yourTeam.deleteCharAt(0);
		yourN--;
	}
	
	else if(yourTeam.charAt(0) == 'F' && bestTeam.charAt(bestTeam.length() -1) == 'E'){
		yourTeam.deleteCharAt(0);
		yourN--;
	}
	
	else if(yourTeam.charAt(0) == bestTeam.charAt(bestTeam.length() - 1)){
		myTeam.deleteCharAt(myTeam.indexOf(String.valueOf(yourTeam.charAt(0))));
		myN--;
		yourTeam.deleteCharAt(0);
		yourN--;
		catNeeded = true;
	}
	
	else {
		myTeam.deleteCharAt(myTeam.indexOf(String.valueOf(bestTeam.charAt(bestTeam.length() - 1))));
		myN--;
		catNeeded = true;
	}
}
	
}
