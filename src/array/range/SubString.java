package array.range;

public class SubString {
    public static void generateSubString(String string){
        //Time complixty O(n2)
        int length= string.length();
        for (int index1 = 0; index1 <length ; index1++) {
                String str="";
            for (int index2 = index1; index2 <length ; index2++) {
                    str+=string.charAt(index2);
                System.out.println(str);
            }
        }
    }

    public static void generateSubString1(String str){
         int length=str.length();
        for (int index1 = 0; index1 < length; index1++) {
            for (int index2 = index1; index2 < length; index2++) {
                System.out.println(str.substring(index1, index2+1));
            }
        }
    }

    public static void generateSubString2(String str){
        int length=str.length();
        for (int index1 = 1; index1 <= length; index1++) {
            for (int index2 =0; index2+index1 <= length; index2++) {
                System.out.println(str.substring(index2, index1));
            }
        }
    }


    public static void main(String[] args) {
        generateSubString2("abcd");
//        String string="hegazy";
//        System.out.println(string.substring(string.length()-1,string.length()+1));
    }
}
