package com.semarslan.grpcservice.protobuf;

import com.google.protobuf.Int32Value;
import com.semarslan.grpcservice.models.Person;


public class PersonDemo {

    public static void main(String[] args) {
        Person sema = Person.newBuilder()
                .setName("sema")
                .setAge(Int32Value.newBuilder().setValue(18).build())
                .build();

//        Path path = Paths.get("sema.serialize");
//		Files.write(path, sema.toByteArray());

        System.out.println(sema.toString());
    }
}
