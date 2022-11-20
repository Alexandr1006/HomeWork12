import java.time.LocalDate;

public class Main {
    public static final int currentYear = LocalDate.now().getYear();

    public static void main(String[] args) {
        printIsYearLeap(2004);
        printAppInstsllMessage(1, 2019);
        printDayDelivery(80);
    }
    //OneTask
    public static void printIsYearLeap(int year) {
        boolean numberYear = isEvenNumber(year);
        printIsNumberYearResult(year, numberYear);
    }

    private static boolean isEvenNumber(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsNumberYearResult(int year, boolean numberYear) {
        if (numberYear) {
            System.out.println(year + "— високосный год");
        } else {
            System.out.println(year + "— не високосный год");
        }
    }
    //TwoTask

    public static void printAppInstsllMessage(int osName, int deviceYear) {
        boolean oldDevice = isOldDevice(deviceYear);
        print(osName, oldDevice);
    }

    private static String getClientOS(int osName) {
        if (osName == 0) {
            return "iOS";
        } else if (osName == 1) {
            return "Android";
        }
        return "Твоя ОС";
    }
        private static boolean isOldDevice (int deviceYear){
            return deviceYear < currentYear;
        }
        private static void print (int osName, boolean deviceYear){
            if (deviceYear) {
                System.out.println("Пожалуйста установи " + getClientOS(osName) + " lite-версию" );
            } else {
                System.out.println("Пожалуйста установи " + getClientOS(osName) + " новую версию");
            }
    }
    //threeTask
    public static void printDayDelivery(int deliveryDistance){
    int dayDelivery = culculatDeliveryResult (deliveryDistance);
    if (dayDelivery == 0){
        System.out.println("Доставки нет");
    }else
        System.out.println("Дней доставки " + dayDelivery );

    }
    private static int culculatDeliveryResult (int deliveryDistance){
        int firstDayDelivery = 20;
        int secondDayDelivery = 60;
        int thirdDayDelivery = 100;
        if (deliveryDistance <= 0 || deliveryDistance>thirdDayDelivery){
            return 0;
        }
        else if(deliveryDistance<firstDayDelivery){
            return 1;
        }
        else if(deliveryDistance<secondDayDelivery){
            return 2;
        }
        else
            return 3;
    }
}
