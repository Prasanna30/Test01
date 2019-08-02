package somepackage;

import java.util.regex.Pattern;

public class Reverse1Ex { 
	  
    
    static String reverseCharacter(String str) 
    { 
  
         
        Pattern pattern = Pattern.compile("\\s"); 
        
        String [] temp =pattern.split(str);
        //temp = ["I", "have", "a", "happy", "dog"]
        
        String result =" ";
        
        //String[] temp = pattern.split(str); 
       // String result = ""; 
   
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
            
            System.out.println(result);
        } 
        
        //  I
        // have I
        // a have I
        // happy a have I
        //dog happy a have I;
        return result; 
    }
        public static void main(String[] args) 
        { 
            String s1 = "I have a happy Dog"; 
            System.out.println(reverseCharacter(s1)); 
      
            String s2 = "Happy to learn java Programming"; 
            System.out.println(reverseCharacter(s2)); 
            
            String s3 = "Trying to get a job";
            System.out.println(reverseCharacter(s3));
        } 
     
    } 