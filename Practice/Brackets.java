package Practice;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class Brackets {
    Stack<Character> r = new Stack<Character>();
    public static void main(String[] args) {
        Brackets b = new Brackets();
        System.out.println(b.isValid("{}{}{}{}"));
    }
     boolean isValid(String s){
        boolean b = false;
        for(int i =0;i<s.length();i++){
                char previous='h';
            if(s.charAt(i)=='(' || s.charAt(i) == '{'||s.charAt(i)=='['){
                 previous = s.charAt(i);
                r.push(s.charAt(i));
            }
            if(s.charAt(i)!= previous && (s.charAt(i)==')' || s.charAt(i) == '}'||s.charAt(i)==']')){
                b=true;

                
            }
            else{
                r.pop();
            }

        }
        return !b;
    }

}
