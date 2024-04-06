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
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 */
public class Manual {
    private final CarType carType; // Tipo de carro
    private final int seats; // Número de assentos
    private final Engine engine; // Motor do carro
    private final Transmission transmission; // Transmissão do carro
    private final TripComputer tripComputer; // Computador de viagem do carro
    private final GPSNavigator gpsNavigator; // Navegador GPS do carro

    // Construtor da classe Manual
    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    // Método para imprimir as informações do manual do carro
    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n"; // Tipo de carro
        info += "Count of seats: " + seats + "\n"; // Número de assentos
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n"; // Informações do motor
        info += "Transmission: " + transmission + "\n"; // Informações da transmissão
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n"; // Verifica se o computador de viagem está funcional
        } else {
            info += "Trip Computer: N/A" + "\n"; // Se não houver computador de viagem
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n"; // Verifica se o navegador GPS está funcional
        } else {
            info += "GPS Navigator: N/A" + "\n"; // Se não houver navegador GPS
        }
        return info;
    }
}
