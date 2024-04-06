/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import projeto.Engine;
import projeto.GPSNavigator;
import projeto.Transmission;
import projeto.TripComputer;

/**
 * Car is a product class.
 */
public class Car {
    // Atributos da classe Car
    private final CarType carType; // Tipo do carro
    private final int seats; // Número de assentos
    private final Engine engine; // Motor do carro
    private final Transmission transmission; // Transmissão do carro
    private final TripComputer tripComputer; // Computador de viagem do carro
    private final GPSNavigator gpsNavigator; // Navegador GPS do carro
    private double fuel = 0; // Quantidade de combustível no carro

    // Construtor da classe Car
    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        // Define este carro como o carro associado ao tripComputer, se tripComputer não for nulo
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    // Métodos getter e setter para acessar os atributos privados da classe
    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
