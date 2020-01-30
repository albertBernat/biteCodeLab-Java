package com.ttpsc.bitecodelab.records;

public record Playground(String name, String secondName) {

    public String whatsUp() {
        return name + secondName;
    }
}
