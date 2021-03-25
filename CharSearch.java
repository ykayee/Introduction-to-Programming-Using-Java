public class CharSearch {
    
    public static void main(String[] args) {
        String s = "This class is awesome";
        boolean notFound=true;
        int i;

        for(i=0; (i<s.length())&& notFound;i++){
            if ('a'==s.charAt(i)){
                notFound=false;
            }
        }
        System.out.println("Found char at:"+i);
    }
}
