package javaApp;

public class EvenSum {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int even[] = new int[num];
        int sum = 0, j = 0;
        String evennums = "";

        for (int i = 2; i <= num; i += 2) {
            even[j] = i;
            sum += i;
            evennums += i + ",";
            j++;
        }

        evennums = evennums.substring(0, evennums.length() - 1); // Remove last comma

        System.out.println(evennums);
        System.out.println(sum);
    }
}
