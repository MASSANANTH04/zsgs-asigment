//question-3
public class vowelereverse {
    static boolean chick(char a){
        return a=='a'||a=='A'||
               a=='e'||a=='E'||
               a=='i'||a=='I'||
               a=='o'||a=='O'||
               a=='u'||a=='U';
    }
    public static void main(String[] args) {
        String s="hello";
        System.out.println("input: "+s);
        char ch[]=s.toCharArray();
        int left=0;
        int right =s.length()-1;
        while(left<=right){
            if(chick(ch[left]) && chick(ch[right])){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            else if(!chick(ch[left])){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("Answer: "+String.valueOf(ch));
    }
}
