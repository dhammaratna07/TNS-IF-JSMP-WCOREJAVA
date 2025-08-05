public class Swt {
    public static void main(String[] args) {
        int userinput = 1;

        switch (userinput) {
            case 1:
                System.out.println(userinput + ": Current plan details");
                break;
            case 2:
                System.out.println(userinput + ": Change plan");
                break;
            case 3:
                System.out.println(userinput + ": Contact our customer care");
                break;
            case 4:
                System.out.println(userinput + ": Call our customer care");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
