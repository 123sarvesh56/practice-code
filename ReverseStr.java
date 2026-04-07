public class ReverseStr {
    public static void main(String[] args){
        String str="madam";
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        if(str.equals(result)){
            System.out.println("Palindrome");       
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    
}
