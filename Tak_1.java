import java.util.*;
import java.util.stream.*;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .map(salary -> salary + salary / 10)
                .forEach(salary -> System.out.print(salary + " "));

        sc.close();
    }
}

input:
5
10000
2000
3000
2000
40000
out put:
11000
2200
33000
22000
44000
