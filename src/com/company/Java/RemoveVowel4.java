package com.company.Java;

public class RemoveVowel4 {
    public String[] eleminateVowels(String[] places){
        String[] vowels=new String[]{"a","e","i","o","u"};
        for(int index=0;index<places.length;index++){
            for(String vowel:vowels) {
                if (places[index].contains(vowel))
                    places[index]=places[index].replace(vowel, "");
            }
        }
        return places;
    }
}
