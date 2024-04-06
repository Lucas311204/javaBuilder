/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import projeto.CarBuilder;
import projeto.CarManualBuilder;
import projeto.Car;
import projeto.Manual;
import projeto.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        // Cria uma instância do diretor
        Director director = new Director();

        // Cria um construtor de carros
        CarBuilder builder = new CarBuilder();

        // O diretor instrui o construtor a construir um carro esportivo
        director.constructSportsCar(builder);

        // O carro final é obtido a partir do construtor
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        // Cria um construtor de manuais de carros
        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O diretor instrui o construtor de manuais a construir um manual para um carro esportivo
        director.constructSportsCar(manualBuilder);

        // O manual do carro é obtido a partir do construtor de manuais
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
