import java.util.*;
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String description ="\nDescription of the graph of:\n";
		description += a+"x^2 +  "+b+"x + "+c;
		description +="\nOpens: ";
		if (a <0) {
			description +="Down\n";
		}else {
			description +="Up\n";
		}
		double xVertexCoord = -1*b/(2*a);
		description +="Axis of Symmetry: "+round2(xVertexCoord)+"\n";
		double yVertexCoord = a*xVertexCoord*xVertexCoord+b*xVertexCoord+c;
		description +="Vertex: ("+round2(xVertexCoord)+", "+round2(yVertexCoord)+")\n";
		description +="x-intercept(s): "+quadForm(a,b,c)+"\n";
		return description;
	}
	public static double round2(double num) {
		num = num*100;
		num = num +0.5;
		num = (int) num;
		num = num/100.0;
		return num;
	}
	public static String quadForm(double a, double b, double c) {
		double discrim = discriminant(a,b,c);
		if (discrim <0) {
			return "none";
		}else if (discrim == 0) {
			return -1*b/(2*a)+"";
		}
		double root1 = ()-1*b + Math.sqrt(discrim))/(2*a);
		
		else return "";
	}
	public static double discriminant(double a, double b, double c) {
		return b*b -4*a*c;
	}
}
