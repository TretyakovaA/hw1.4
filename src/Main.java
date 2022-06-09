
// while (условие) {
//   итерация
//}
// i++ ++i i-- --i
// for (выполняемое до цикла; условие; выполняемое после итерации) {
//}
//       1 2 3 4 5 6 7 8 9 10 10 9 8 7   " sd  " + "sds"
public class Main {
    public static void main(String[] args) {

        // while 1..10
        // тип переменной наименование = значение;
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");



        }
        // for 10..1


        //// task2
        int firstFriday=1;
        System.out.println();
        for (int e =1; e<=31; e+=7 ) {

            System.out.println ("Сегодня пятница, " + e+"е число. Необходимо подготовить отчет.");
        }

        ////task3
        int yearStart =1896;
        int yearLast = 2054;
        for (int comet= yearStart; comet<=yearLast; comet+=79 ) {
            System.out.println("в " + comet + " году");
        }


    }


}

