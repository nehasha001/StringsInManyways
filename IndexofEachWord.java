package Assignment4;

public class IndexofEachWord {
    public static void findIndexes(){
        String searchableString = "This is Java Class";
        String keyword = "Java";

        int index = searchableString.indexOf(keyword);
        while (index >=0){
            System.out.println("Index : "+index);
            index = searchableString.indexOf(keyword, index+keyword.length());
        }
    }

    public static void main(String[] args) {
        findIndexes();
    }}