/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import projeto.Manual;
import projeto.CarType;
import projeto.Engine;
import projeto.GPSNavigator;
import projeto.Transmission;
import projeto.TripComputer;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class CarManualBuilder implements Builder {
    // Atributos para armazenar os detalhes do manual do carro a ser construído
    private CarType type; // Tipo do carro
    private int seats; // Número de assentos
    private Engine engine; // Motor do carro
    private Transmission transmission; // Transmissão do carro
    private TripComputer tripComputer; // Computador de viagem do carro
    private GPSNavigator gpsNavigator; // Navegador GPS do carro

    // Métodos para definir os detalhes do manual do carro
    @Override
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

    // Método para obter o resultado da construção do manual do carro
    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
