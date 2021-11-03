package com.semarslan.grpcservice.protobuf;

import com.semarslan.grpcservice.models.Credentials;
import com.semarslan.grpcservice.models.Email;
import com.semarslan.grpcservice.models.Phone;

public class OneOfDemo {

    public static void main(String[] args) {

        Email email = Email.newBuilder()
                .setEmail("94.sema.arslan@gmail.com")
                .setPasswd("test123")
                .build();

        Phone phone = Phone.newBuilder()
                .setNumber(12121221)
                .setCode(312)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(email)
                .build();

        login(credentials);
    }

    private static void login(Credentials credentials) {
        System.out.println(credentials.getEmailMode());
    }
}
