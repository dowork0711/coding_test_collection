import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    백스페이스 -
    화살표 입력 <, >
*/

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            String pwInput = br.readLine();

            Stack<Character> st = new Stack<>();
            Stack<Character> st2 = new Stack<>();

            for (int i = 0; i < pwInput.length(); i++) {
                
                switch (pwInput.charAt(i)) {
                    case '<':
                        if (!st.isEmpty()) st2.add(st.pop());
                        break;
                    case '>':
                        if (!st2.isEmpty()) st.add(st2.pop());
                        break;
                    case '-':
                        if (!st.isEmpty()) st.pop();
                        break;
                    default:
                        st.add(pwInput.charAt(i));
                        break;
                }   // 입력된 키(방향키, 화살표)에 따라
            }

            StringBuilder sb2 = new StringBuilder();

            while(!st.isEmpty()) {
                sb2.append(st.pop());
            }
            sb.append(sb2.reverse());
            
            while (!st2.isEmpty()) {
                sb.append(st2.pop());
            }
            sb.append("\n");

        }

        System.out.println(sb);

        
    }
}