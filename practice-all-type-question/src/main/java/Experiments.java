import java.util.ArrayList;
import java.util.function.Predicate;

public class Experiments {
	
	public static void main(String[] args) {
		
		String s="  He is a very very good boy, isn't he?";
		s="           YES      leading spaces        are valid,    problemsetters are         evillllll"+"?";
		Predicate<Character> chkAtoZoraToz=(c)->c>='a'&&c<='z'||c>='A'&&c<='Z';
        ArrayList<String> tokens=new ArrayList<>();
        int start=0;
        int end=1;
        for(int i=1;i<=((s!=null)?s.length()-1:0);i++){
        	if(chkAtoZoraToz.test(s.charAt(i-1))&&chkAtoZoraToz.test(s.charAt(i))) {
        		end++;
        	}else {
        		if(chkAtoZoraToz.test(s.charAt(i-1))&&!chkAtoZoraToz.test(s.charAt(i))){
        			tokens.add(s.substring(start,end));	
        		}else {
        			start=i;
                    end=i+1;
        			continue;
        		}
        		
                start=i;
                end=i+1;
        	}
        		
        	
//            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'){
//               end++;
//            }else{
//                tokens.add(s.substring(start,end));
//                start=i;
//                end=i;
//            }
        }
        System.out.println(tokens);
	}

}
