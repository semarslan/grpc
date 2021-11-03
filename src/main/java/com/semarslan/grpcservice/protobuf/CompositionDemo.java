package com.semarslan.grpcservice.protobuf;

import com.google.protobuf.Int32Value;
import com.semarslan.grpcservice.models.Address;
import com.semarslan.grpcservice.models.Car;
import com.semarslan.grpcservice.models.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompositionDemo {
    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setPostbox(1010)
                .setCity("Ankara")
                .setStreet("Dumlupinar")
                .build();




        List<Car> carList = new ArrayList<>();
        carList.add(
                Car.newBuilder()
                .setYear(2013)
                .setMake("Toyota")
                .setModel("Auris")
                .build()
        );
        carList.add(
                Car.newBuilder()
                .setYear(2021)
                .setMake("Toyota")
                .setModel("CHR")
                .build()
        );

        Person person = Person.newBuilder()
                .setName("sema")
                .setAge(Int32Value.newBuilder().setValue(18).build())
                .setAddress(address)
                .addAllCar(carList)
                .build();

        System.out.println(person.toString());
    }
}
