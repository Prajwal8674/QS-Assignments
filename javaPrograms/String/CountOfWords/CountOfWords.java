package String.CountOfWords;

public class CountOfWords {

    public static void main(String[] args) {

        String name = "Prajwal Pramod Patil";
        int words = 0;
        int space=0;
        int count=0,start=0;

        for(int i = 0 ;  i < name.length() ; i++){

            if(name.charAt(i)==' '){
                space++;
                start=name.charAt(i);

                for (int j = start+1 ; j < name.length() ; j++){
                    System.out.println(start);
                }
            }
            if(name.charAt(i)!=' '){
              count++;
            }
        }
        System.out.println(count);
    }
}
