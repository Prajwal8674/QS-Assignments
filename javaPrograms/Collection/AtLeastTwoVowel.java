package Collection;

import java.util.ArrayList;

public class AtLeastTwoVowel {

    public static void main(String[] args) {

        int count = 1;
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("heelo");
        list.add("heela");
        list.add("hlo");
        list.add("hrr");

        ArrayList<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        System.out.println(list);
        System.out.println(vowel);
        for(String value : list){

            for (int i = 0 ; i< value.length() ;i++){

                if(value.charAt(i)==vowel.get(i)){
                  count++;
                    if(count>2){
                        System.out.println(value);
                    }
                }
            }

        }

    }
}
