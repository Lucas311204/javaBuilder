/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

// Classe que representa o motor de um carro
public class Engine {
    private final double volume; // Volume do motor (em litros)
    private double mileage; // Quilometragem do motor
    private boolean started; // Indica se o motor está ligado ou desligado

    // Construtor da classe Engine
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    // Liga o motor
    public void on() {
        started = true;
    }

    // Desliga o motor
    public void off() {
        started = false;
    }

    // Verifica se o motor está ligado
    public boolean isStarted() {
        return started;
    }

    // Simula a ação de dirigir, aumentando a quilometragem
    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!"); // Exibe uma mensagem de erro se o motor não estiver ligado
        }
    }

    // Obtém o volume do motor
    public double getVolume() {
        return volume;
    }

    // Obtém a quilometragem do motor
    public double getMileage() {
        return mileage;
    }
}
