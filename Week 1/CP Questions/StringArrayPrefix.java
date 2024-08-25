// Longest Common Prefix of Strings
import java.util.ArrayList;
import java.util.Scanner;
class StringArrayPrefix{
    public static String LongestCommonPrefix(String [] Arr){
        if(Arr == null || Arr.length == 0){
            return "-1";
        }
        String pre = Arr[0];
        for(int i=1; i<Arr.length; i++){
            while (Arr[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) {
                    return "-1";
                }
            }
        }
        return pre;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputArr = new ArrayList<>();
        while (true) {
            String arr = sc.nextLine();
            if(arr.isEmpty())
                break;
            inputArr.add(arr);
        }
        String [] Arr = inputArr.toArray(new String[0]);
        System.out.println(LongestCommonPrefix(Arr));
    }
}