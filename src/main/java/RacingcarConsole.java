import domain.Car;

import java.util.*;

public class RacingcarConsole {
    private Scanner scanner = new Scanner(System.in);
    private Car[] cars;
    private Random random = new Random();

    public void start() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String[] names = scanner.next().split(",");

        System.out.println(Arrays.toString(names));

        cars = new Car[names.length];

        for (int i=0; i<names.length; i++) {
            cars[i] = new Car(names[i]);
        }

        System.out.println("시도할 회수는 몇회인가요?");
        int count = scanner.nextInt();

        System.out.println("실행 결과");

        for (int i=0; i<count; i++) {
            for (int j=0; j<cars.length; j++) {
                int randomVal = random.nextInt(10);

                if (randomVal >= 4) {
                    cars[j].increasePosition();
                }

                System.out.print(cars[j].getName() + " : ");

                for (int k=0; k<cars[j].getPosition(); k++) {
                    System.out.print("- ");
                }
                System.out.println();
            }

            System.out.println();
        }
        for (int i=0; i<cars.length; i++) {
            System.out.print(cars[i].getName() + " : ");
            System.out.print(cars[i].getPosition());
            System.out.println();
        }
    }
}
