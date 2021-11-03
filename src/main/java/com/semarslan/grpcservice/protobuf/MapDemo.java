package com.semarslan.grpcservice.protobuf;

import com.semarslan.grpcservice.models.BodyStyle;
import com.semarslan.grpcservice.models.Car;
import com.semarslan.grpcservice.models.Dealer;

public class MapDemo {

    public static void main(String[] args) {
        Car car1 = Car.newBuilder()
                .setYear(2013)
                .setMake("Toyota")
                .setModel("Auris")
                .setBodyStyle(BodyStyle.HATCHBACK)
                .build();

        Car car2 = Car.newBuilder()
                .setYear(2021)
                .setMake("Toyota")
                .setModel("CHR")
                .build();
        Dealer dealer = Dealer.newBuilder()
                .putModel(2013, car1)
                .putModel(2021, car2)
                .build();

        System.out.println(
//                dealer.getModelOrThrow(2013)
                dealer.getModelMap()
        );

    }
}
