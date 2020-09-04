import constants.Message;
import domain.Car;
import util.ScannerUtil;

import java.util.*;

public class RacingcarConsole {
    private Car[] cars;
    private Random random;
    private ScannerUtil scannerUtil;

    public RacingcarConsole() {
        this.random = new Random();
        this.scannerUtil = new ScannerUtil();
    }
    public void start() {
        String[] names = scannerUtil.getStrArrByInputMessage(Message.INPUT_CAR_NAME_MESSAGE);
        createCars(names);

        int attemptCount = scannerUtil.getIntByInputMessage(Message.ATTEMPT_COUNT_MESSAGE);
        playRacing(attemptCount);

        for (int i=0; i<cars.length; i++) {
            System.out.print(cars[i].getName() + " : ");
            System.out.print(cars[i].getPosition());
            System.out.println();
        }
    }

    public void createCars(String[] names) {
        cars = new Car[names.length];

        for (int i=0; i<names.length; i++) {
            cars[i] = new Car(names[i]);
        }
    }

    public void playRacing(int attemptCount) {
        System.out.println(Message.EXECUTE_RESULT_MESSAGE);

        String mark = "-";

        for (int i=0; i<attemptCount; i++) {
            for (int j=0; j<cars.length; j++) {
                int randomVal = random.nextInt(10);

                cars[j].play(randomVal);

                String markRepeated = String.join(" ", Collections.nCopies(cars[j].getPosition(), mark));
                System.out.println(cars[j].getName() + " : " + markRepeated);
            }

            System.out.println();
        }
    }
}
