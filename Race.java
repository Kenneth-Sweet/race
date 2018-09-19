import java.util.Scanner;
import java.lang.Math;

class Race {
  public static void main(String[] args) {
    
    // Create a scanner
Scanner input = new Scanner(System.in);

// Race 1
System.out.print("Enter the time for each runner for race 1: ");
double Race1Runner1 = input.nextDouble();
double Race1Runner2 = input.nextDouble();
double Race1Runner3 = input.nextDouble();
double Race1Runner4 = input.nextDouble();
System.out.print("Enter the time for each runner for race 2: ");

// Calculate Race 1 Results
double maxOfRace1 = max(Race1Runner1, Race1Runner2, Race1Runner3, Race1Runner4);
double minOfRace1 = min(Race1Runner1, Race1Runner2, Race1Runner3, Race1Runner4);
double gapOfRace1 = maxOfRace1 - minOfRace1;

// Display Results
System.out.println("Fastest Time for Race 1: " + maxOfRace1);
System.out.println("Slowest Time for Race 1: " + minOfRace1);
System.out.println("Top-bottom gap for Race 1: " + gapOfRace1);
    

  }
  public static double max(double Runner1,double Runner2, double Runner3, double Runner4) {

    double maximum = Runner1;

    if (Runner2 > maximum)
        maximum = Runner2;
    if (Runner3 > maximum)
        maximum = Runner3;
    if (Runner4 > maximum)
        maximum = Runner4;

     return maximum;
}
public static double min(double Runner1,double Runner2, double Runner3, double Runner4) {

    double minimum = Runner1;

    if (Runner2 > minimum)
      minimum = Runner2;
    if (Runner3 > minimum)
      minimum = Runner3;
    if (Runner4 > minimum)
      minimum = Runner4;

     return minimum;
}
  
}
