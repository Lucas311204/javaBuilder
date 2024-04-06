/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

// Classe que representa o computador de viagem do carro
public class TripComputer {

    private Car car; // Carro associado ao computador de viagem

    // Método para definir o carro associado ao computador de viagem
    public void setCar(Car car) {
        this.car = car;
    }

    // Método para exibir o nível de combustível do carro
    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    // Método para exibir o status do carro (ligado/desligado)
    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started"); // Carro está ligado
        } else {
            System.out.println("Car isn't started"); // Carro está desligado
        }
    }
}
