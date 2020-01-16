package com.ttpsc.bitecodelab.optional;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class Optionals {

    public static void main(String[] args) {
        String variable = "value";
        Optional<String> optionalVariable = Optional.of(variable);

        System.out.println("Step 1: Is present? " + optionalVariable.isPresent());
        System.out.println("Value: " + optionalVariable.get());

        optionalVariable = Optional.empty();
        System.out.println("Step 2: Is present? " + optionalVariable.isPresent());

        String defaultValue = "defaultValue";
        System.out.println("Step 3: Is present? " + optionalVariable.isPresent());
        System.out.println("Value: " + optionalVariable.orElse(defaultValue));

        Supplier<String> valueSupplier = () -> {
            int i = new Random().nextInt(10);
            return "dynamicGeneratedValue " + i;
        };
        System.out.println("Step 4: Is present? " + optionalVariable.isPresent());
        System.out.println("Value: " + optionalVariable.orElseGet(valueSupplier));

        System.out.println("Optional map and ifPresent:");

        Company nullCompany = null;
        Company companyWithAddressAndStreet = new Company(new Address(new Street("Street1")));
        Company companyWithoutAddress = new Company(null);
        Company companyWithAddressWithoutStreet = new Company(new Address(null));


        printCompanyStreetName(nullCompany);
        printCompanyStreetName(companyWithAddressAndStreet);
        printCompanyStreetName(companyWithoutAddress);
        printCompanyStreetName(companyWithAddressWithoutStreet);

    }


    private static void printCompanyStreetName(Company company) {
        //TODO ZADANIE 3 do aktualnego kodu dopisz obsluge braku ulicy,
        // jesli nie ma ulicy, adresu itp zwroc "404 street not found"

        if(company!=null){
            Address address = company.getAddress();
            if(address!=null){
                Street street = address.getStreet();
                if(street!=null) {
                    String name = street.getName();
                    System.out.println(name);
                }
            }
        }
        //TODO ZADANIE 4 Przerob logikę tej metody na wykorzystująco możliwości Optionala!
    }
}

class Company {
    private Address address;

    public Company(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private Street street;

    public Address(Street street) {
        this.street = street;
    }

    public Street getStreet() {
        return street;
    }
}

class Street {
    private String name;

    public Street(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}