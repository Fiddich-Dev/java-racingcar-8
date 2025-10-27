package racingcar.simulator;

import racingcar.Car;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RaceSimulator {

    private final List<Car> cars;
    private final BigInteger count;

    public RaceSimulator(List<String> carNames, BigInteger count) {
        this.cars = new ArrayList<>();
        for(String carName : carNames) {
            cars.add(new Car(carName));
        }
        this.count = count;
    }

    public List<String> simulate() {
        System.out.println("실행 결과");

        BigInteger i = BigInteger.ZERO;
        while (i.compareTo(count) < 0) {
            tryMove();
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

    private void tryMove() {
        for(Car car : cars) {
            car.tryMove();
            print(car);
        }
    }

    private void print(Car car) {
        System.out.println(car.getName() + " : " + convert(car.getDistance()));
    }

    private String convert(BigInteger distance) {
        StringBuilder stringBuilder = new StringBuilder();
        BigInteger i = BigInteger.ZERO;

        while (i.compareTo(distance) < 0) {
            stringBuilder.append("-");
            i = i.add(BigInteger.ONE);
        }

        return stringBuilder.toString();
    }
}
