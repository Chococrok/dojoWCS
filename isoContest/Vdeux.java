/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 *  IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 * ***/
package com.isograd.exercise;
import java.util.*;

public class IsoContest {
public static void main( String[] argv ) throws Exception {

		Scanner sc = new Scanner(System.in);
		int myN = Integer.valueOf(sc.nextLine());
		int turn = myN;
		String myTeam = sc.nextLine();
		char myArray[] = myTeam.toCharArray();
		int yourN = Integer.valueOf(sc.nextLine());
		String yourTeam = sc.nextLine();
		String bestTeam = "";
		int j = 0;
		
		while( j < yourTeam.length( ) && myN != 0 & yourN != 0){
		    if(yourTeam.charAt(j) == 'P'){
		        for (int i = 0; i < myArray.length; i++){
		            if(myArray[i] == 'F'){
		                    yourN--;
		                    bestTeam += 'F';
		            }
	                else if(myArray[i] == 'P'){
		                    myN--;
		                    yourN--;
		                    myArray[i] = 'l';
		                    bestTeam += 'P';
                    }
                    else{myN = 0;}
		        }
		    }
		    j++;
		}
		if(myN == 0){
		    bestTeam = "-"+ bestTeam;
		}else if (yourN == 0){
		    bestTeam = "+" + bestTeam;
		}
		else{
		    bestTeam = "=" + bestTeam;
		}
		System.out.println(bestTeam);

	}
}
