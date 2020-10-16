// AUTHOR
// Stuti Jain
// USER ID
// https://cses.fi/user/25504
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1069
// Repetition
 
public class Stuti_Repetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count = 1;
        int max = 1;
        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                if (count>max)
                    max=count;
                count=1;
            }
        }
        if (count>max)
            max=count;
        System.out.println(max); 
 
    }
}
