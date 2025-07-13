public class Main {
    public static void main(String[] args) {
        Logger log1=Logger.getInstance();
        Logger log2=Logger.getInstance();

        log1.log("This is the first log ");
        log2.log("This is the second log ");

        if(log1==log2){
            System.out.println("Both log1 and log2 refering to the same object");
        } else {
            System.out.println("Different objects exist");
        }
    }
}
