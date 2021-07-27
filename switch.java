public class switchs {
    public static void main(String[] args){
        String day="sunday";
        switch(day) {
            case "monday":
                System.out.println("it's monday");
                break;
            case "tuesday":
                System.out.println("it's tuesday");
                break;
            case "wednesday":
                System.out.println("it's wednesday");
                break;
            case "thursday":
                System.out.println("it's thursday");
                break;
            case "friday":
                System.out.println("it's saturday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("it's a weekend,enjoy!");
            default:
                System.out.println("it's not a day");
        }
    }
}
