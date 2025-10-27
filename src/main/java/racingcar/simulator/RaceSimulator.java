package racingcar.simulator;

import racingcar.Car;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RaceSimulator {

    private static final String RACE_START_MESSAGE = "실행 결과";
    private static final String DISTANCE_MARK = "-";
    private final List<Car> cars;
    private final BigInteger count;

    public RaceSimulator(List<String> carNames, BigInteger count) {
        this.cars = new ArrayList<>();
        for(String carName : carNames) {
            cars.add(new Car(carName));
        }
        this.count = count;
    }

    public List<String> race() {
        System.out.println(RACE_START_MESSAGE);

        BigInteger i = BigInteger.ZERO;
        while (i.compareTo(count) < 0) {
            carsTryMove();
            System.out.println();
            i = i.add(BigInteger.ONE);
        }

        return findWinners();
    }

    private List<String> findWinners() {
        BigInteger maxDistance = BigInteger.ZERO;
        for (Car car : cars) {
            if (car.getDistance().compareTo(maxDistance) > 0) {
                maxDistance = car.getDistance();
            }
        }

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getDistance().equals(maxDistance)) {
                winners.add(car.getName());
            }
        }

        return winners;
    }

    private void carsTryMove() {
        for(Car car : cars) {
            car.tryMove();
            printNameAndDistance(car);
        }
    }

    private void printNameAndDistance(Car car) {
        System.out.println(car.getName() + " : " + convertDistanceToMarks(car.getDistance()));
    }

    private String convertDistanceToMarks(BigInteger distance) {
        StringBuilder stringBuilder = new StringBuilder();
        BigInteger i = BigInteger.ZERO;

        while (i.compareTo(distance) < 0) {
            stringBuilder.append(DISTANCE_MARK);
            i = i.add(BigInteger.ONE);
        }

        return stringBuilder.toString();
    }
}
