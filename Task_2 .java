import java.util.*;

public class Stream{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, double[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            double temp = sc.nextDouble();

            if (temp > 50) {
                if (!map.containsKey(id)) {
                    map.put(id, new double[]{0, 0});
                }

                map.get(id)[0] += temp; 
                map.get(id)[1]++;       
            }
        }

        List<String> ids = new ArrayList<>(map.keySet());

        ids.sort((a, b) ->
            Double.compare(
                map.get(b)[0] / map.get(b)[1],
                map.get(a)[0] / map.get(a)[1]
            )
        );

        for (String id : ids) {
            double average = map.get(id)[0] / map.get(id)[1];
            System.out.printf("%s %.1f%n", id, average);
        }

        sc.close();
    }
}


Sample Input
6
S1 60
S2 40
S1 80
S3 70
S2 90
S3 30
Sample Output
S1 70.0
S2 90.0
S3 70.0

