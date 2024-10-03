package com.juaracoding.oop;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {

        Fruit apple = new Fruit();
        apple.grams = 2;
        apple.calsPerGram = 57;
        System.out.println(apple.totalCalories() + " Total Calories");
        System.out.println(apple);

        Fruit mango = new Fruit();
        mango.grams = 2;
        mango.calsPerGram = 59;
        System.out.println(mango.totalCalories() + " Total Calories");
        System.out.println(mango);

        Date date = new Date();
        System.out.println(date);

        Kotak kotakPertama = new Kotak(10); // pass an integer as argument
        kotakPertama.sisi = 10;
        kotakPertama.draw();

        Kotak kotakKedua = new Kotak(5); // pass an integer as argument
        kotakKedua.sisi = 10;
        kotakKedua.draw();

        Segitiga segitiga = new Segitiga(10);
        System.out.println(segitiga);

        //car
        Car car = new Car("Pertalite");
        car.warna();
        car.mesin();
        System.out.println();
        System.out.println(car.getBahanBakar());
        System.out.println(car.getTahunPembuatan());

        //employee
        Employee employee = new Employee("John Doe", "Finance", 8000, true);
        employee.displayInfoEmp();

    }
}
