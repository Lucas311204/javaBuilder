/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

// Classe que representa um navegador GPS
public class GPSNavigator {
    private String route; // Rota atual do navegador GPS

    // Construtor padrão que define uma rota padrão
    public GPSNavigator() {
        this.route = "221b, Baker Street, London to Scotland Yard, 8-10 Broadway, London";
    }

    // Construtor que permite definir uma rota manualmente
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    // Método para obter a rota atual do navegador GPS
    public String getRoute() {
        return route;
    }
}
