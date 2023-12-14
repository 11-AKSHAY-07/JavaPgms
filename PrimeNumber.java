
import java.util.Scanner;

public class PrimeNumber {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the starting number: ");
int start = scanner.nextInt();
System.out.print("Enter the ending number: ");
int end = scanner.nextInt();
primenumbers(start, end);
}
public static boolean isPrime(int number) {
if (number <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(number); i++) {
if (number % i == 0) {
return false;
}
}
return true;
 }
public static void primenumbers(int start, int end) {
for (int i = start; i <= end; i++) {
if (isPrime(i)) {
System.out.print(i +" ");
}}
}}