package demo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Tester {
	
	public static void main(String[] args) {
		String shirtCode="T300";
		Pattern pat= Pattern.compile("(D|T|Q)-\\d{3}");
    	Matcher mat= pat.matcher(shirtCode);
    	if(mat.matches()) System.out.println("True");
    	else System.out.println("false");
	}

}
