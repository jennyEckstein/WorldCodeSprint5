import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Jenny on 7/24/2016.
 */
public class StringConstruction {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int a0 = 0; a0 < n; a0++){
                String s = in.next();

                if(s.length() <= 1){
                    System.out.println(0); //cost 0 if str is empty
                }

                HashMap<Character, Integer> hashMap = new HashMap<>();
                for (int i = 0; i < s.length(); i++){
                    char key = s.charAt(i);
                    if(!hashMap.containsKey(key)){
                        hashMap.put(key, 1);
                    }else{
                        hashMap.put(key, hashMap.get(key) + 1);

                    }
                }
                System.out.println(hashMap.size());
            }
        }

}
