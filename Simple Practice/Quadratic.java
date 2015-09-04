public class Quadratic{
public static void main(String args[]){
//double b=Double.parseDouble(String args[0]);
//double c=Double.parseDouble(String args[1]);
double b=-3.0;
double c=2.0;
double d= b*b - 4*c;
double sqrt=Math.sqrt(d);
double sqrt1=(-b+sqrt)/2;
double sqrt2=(-b-sqrt)/2;
System.out.println(sqrt1 +" "+ sqrt2);
}
}