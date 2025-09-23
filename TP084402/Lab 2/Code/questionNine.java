public class questionNine {
    public static void main(String[] args){
        int base = 10000;
        double percentage = 1.05;
        int duration = 10;

        for (int i = 1; i < duration; i++){
            base = (int) (base * percentage);
        }
        System.out.println(base);
    }
}
