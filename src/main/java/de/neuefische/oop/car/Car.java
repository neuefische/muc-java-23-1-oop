package de.neuefische.oop.car;

// Klasse = Wo man Objekte definiert
/*
* Klasse = Bauplan für Objekte = Neuer Typ
* - Hat Eigenschaften
* - Hat Methoden
*
* - Sollte eine toString Methode beinhalten
*
* */
public class Car {
    // Eigenschaften von einer Klasse
    private String color;
    private String manufacturer;
    private int year = 2020;
    private String model;

    private String emissionRanking;

    private boolean isElectric;

    // Standardkonstruktor = Leerer Konstruktor
    public Car() {}


    // Wenn man Konstruktoren mit Parametern erstellt, BRAUCHT MAN auch den leeren Konstruktor
    // (wenn man Objekte mit new Car() erstellen will)
    public Car(String color) {
        this.color = color;
    }

    public Car(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    // Konstruktor = Bauanleitung = Methode die uns ein neues Objekt liefert
    // public = Welche Sichtbarkeit wir haben
    // Car = Der Klassenname und gleichzeitig der
    // Rückgabewert
    public Car(String color, String manufacturer, int year, String model) {
//        System.out.println("Hallo, I bims der Konstruktor von Car!");
//        System.out.println("ich hab bekommen die werte: " + color + " " + manufacturer);

        this.color = color;
        this.manufacturer = manufacturer;
        this.year = year;
        this.model = model;
    }

    public void setEmissionRanking(String emissionRanking) {
        // Geben den neuen Wert an die Eigenschaft
        this.emissionRanking = emissionRanking;
    }


    // Für get:
    // Neue Methode
    // get + <Name der Eigenschaft>

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    // Für set:
    // Neue Methode
    // set + <Name der Eigenschaft>
    // Übergeben den neuen Wert


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Methoden
    // Protected = Man darauf darauf zugreifen,
    // wenn man im selben package ist
    public String printCar(){
        return  "[Color: " + color + " Manufacturer:  "+ manufacturer + "  Year:  " +year + "  Model:  "+ model+ "]";
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}