
public class LSearch_string {
    public static void main(String[] args) {
        String name="university";
        char target = 'e';

        System.out.print(search(name,target));
        
    }
    static boolean search(String name ,char target){
        if(name.length()==0){
            return false;
        }
        for(int i =0; i < name.length();i++){
            if(target==name.charAt(i)){
                System.out.println("Char found at index : "+i);
            }
        }
        return false;
    }
}
