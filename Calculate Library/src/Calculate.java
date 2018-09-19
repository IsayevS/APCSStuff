//Contains various methods for math calculations.
public class Calculate {
public static int square (int number) {
	//Returns square of an interger.
		return number * number;
			//or int answer; answer= number * number; return answer;
	}
	
public static int cube (int number) {
//returns number cubed.
		return number*number*number;
   }

public static double average (double number, double numbertwo) {
//returns a double, average of two.
	double avg= number+numbertwo;
		avg=avg/2;
			return avg;
		
	}

public static double average (double number , double numbertwo , double numberthree) {
//returns the average of three doubles
double avg = number+numbertwo+numberthree;
	avg=avg/3;
		return avg;
}

public static double toDegrees (double number) {
//returns the amount of degrees in each radien you enter
double magic = 180/3.14159;
	magic=magic*number;
		return magic;
}

public static double toRadians (double number) {
//returns the radians from degrees.
double magic = 3.14159/180;
	magic=magic*number;
		return magic;
}

public static double discriminant (double numbera, double numberb, double numberc) {
//takes three inputs, returns discriminant.
 double discrim=numberb*numberb;
 double pb=4*numbera*numberc;
 	discrim=discrim-pb;
 		return discrim;
}

public static String toImproperFrac (int number , int numbertwo , int numberthree) {
//changes mixed number to improper fraction
int top;
	top= number*numberthree;
	top= top+numbertwo;
		String fin= (top+ "/"+ numberthree);
			return fin;
}

public static String toMixedNum (int number, int numbertwo) {
//changes a improper fraction into a mixed number.
int main;
int boop;
int looplog;
	main=number/numbertwo;
	looplog=number;
		while (looplog >= 0){
	looplog=looplog-numbertwo;
}
		boop = numbertwo+looplog;

			String fin= main+" "+boop+"/"+numbertwo;
				return fin;
}

public static String foil (int number, int numbertwo, int numberthree , int numberfour, String var) {
//foils two parts of an equation.
int raz;
int dva;
int tri;
String fin;
	raz= number*numberthree;
	dva=number*numberfour;
	dva=numbertwo*numberthree+dva;
	tri= numbertwo*numberfour;
		fin= raz+var+"^2 + " + dva+var+" + "+tri;
			return fin;
}

public static Boolean isDivisibleBy (int number, int numbertwo) {

double yesorno;
yesorno=number%numbertwo;
if(yesorno!=0) {
	return false;
}
		else {
	return true;
 
}
}

public static double absValue (double number) {
double abs;
abs=number*number;
abs=abs/number;
return abs;
}

public static double max (double number, double numbertwo) {
if (number>numbertwo) {
	return number;
}
else {
	return numbertwo;
}
}

public static double max (double number, double numbertwo, double numberthree) {
if (number>numbertwo) {
	if (number>numberthree) {
		return number;
}
		else if(numberthree>number) {
			return numberthree;
} 
	if (numbertwo>numberthree) {
				return numbertwo;
}
}
}

public static int min (int number, int numbertwo) {
	if (number<numbertwo) {
		return number;
	}
	else {
		return numbertwo;
}
}


public static double round2 (double number) {
int start;
double end;
int en;
double real;
start=(int)number;
end=number%1;
end=end*100;
en= (int)end;
end=en/100;
real=start+end;
return real;

}





}
