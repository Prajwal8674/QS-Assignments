package String.CountVowelsConst;

public class CountVowCons {
    public static void main(String[] args) {

        String s1 = "PRAJWAL IS ON WEEKEND";
        int vow=0,cons=0;
        for(int i = 0 ; i  < s1.length(); i++){
            char ch = s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vow++;
            }else if(ch>='a'||ch>='A'){
                cons++;
            }
        }
        System.out.println(vow);
        System.out.println(cons);
    }
}
