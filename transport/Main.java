package transport;

import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;


import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.Callable;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int counter = 1;
        Car car1 = generateCar(counter++);
        car1.start();
        car1.stop();
        car1.pitStop();
        car1.printType();
        Car car2 = generateCar(counter++);
        car2.start();
        car2.stop();
        car2.bestTimeLap();
        car2.printType();
        Car car3 = generateCar(counter++);
        car3.start();
        car3.stop();
        car3.maxSpeed();
        car3.printType();
        Car car4 = generateCar(counter++);
        car4.start();
        car4.stop();
        car4.printType();


        Bus bus1 = generateBus(counter++);
        bus1.start();
        bus1.stop();
        bus1.pitStop();
        bus1.printType();
        Bus bus2 = generateBus(counter++);
        bus2.start();
        bus2.stop();
        bus2.bestTimeLap();
        bus2.printType();
        Bus bus3 = generateBus(counter++);
        bus3.start();
        bus3.stop();
        bus3.maxSpeed();
        bus3.printType();
        Bus bus4 = generateBus(counter++);
        bus4.start();
        bus4.stop();
        bus4.printType();

        Track track1 = generateTrack(counter++);
        track1.start();
        track1.stop();
        track1.pitStop();
        track1.printType();
        Track track2 = generateTrack(counter++);
        track2.start();
        track2.stop();
        track2.bestTimeLap();
        track2.printType();
        Track track3 = generateTrack(counter++);
        track3.start();
        track3.stop();
        track3.maxSpeed();
        track3.printType();
        Track track4 = generateTrack(counter++);
        track4.start();
        track4.stop();
        track4.printType();


        DriverB alekhin = new DriverB(" Алехин ", true, 10);
        DriverC petrov = new DriverC(" Петров ", true, 22);
        DriverD kvyat = new DriverD(" Квят ", true, 14);

        alekhin.startMove(car1);
        alekhin.startMove(car1);
        alekhin.refill(car1);
        alekhin.printInfo(car1);

        petrov.startMove(track1);
        petrov.stopMove(track1);
        petrov.refill(track1);
        petrov.printInfo(track1);

        kvyat.startMove(bus1);
        kvyat.stopMove(bus1);
        kvyat.refill(bus1);
        kvyat.printInfo(bus1);

    }

    private static Car generateCar(int number) {
        return new Car("марка #" + number, "бренд #" + number, 1.6, TypeOfBody.SEDAN);


    }

    private static Bus generateBus(int number) {
        return new Bus("марка #" + number, "бренд #" + number, 2.5, Capacity.LARGE);

    }

    private static Track generateTrack(int number) {
        return new Track("марка #" + number, "бренд #" + number, 3.6, Weight.N2);

    }


}



