/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import projeto.Car;
import projeto.CarType;
import projeto.Engine;
import projeto.GPSNavigator;
import projeto.Transmission;
import projeto.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    // Atributos para armazenar os detalhes do carro a ser construído
    private CarType type; // Tipo do carro
    private int seats; // Número de assentos
    private Engine engine; // Motor do carro
    private Transmission transmission; // Transmissão do carro
    private TripComputer tripComputer; // Computador de viagem do carro
    private GPSNavigator gpsNavigator; // Navegador GPS do carro

    // Métodos para definir os detalhes do carro
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    // Método para obter o resultado da construção do carro
    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
