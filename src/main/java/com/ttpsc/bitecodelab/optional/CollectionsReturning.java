package com.ttpsc.bitecodelab.optional;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsReturning {
    public static void main(String[] args) {
        MailBox mailBoxWithLetters = new MailBox(Arrays.asList(
                new Letter("a", "b"),
                new Letter("b", "c"),
                new Letter("c", "d")
        ));

        MailBox mailBoxWithoutLetters = new MailBox();


        printAllRecipients(mailBoxWithLetters);
        printAllRecipients(mailBoxWithoutLetters);
    }

    private static void printAllRecipients(MailBox mailBox) {
        List<Letter> letters = mailBox.getLetters();
        if (!(letters == null || letters.isEmpty())) {
            for (Iterator<Letter> iterator = letters.iterator(); iterator.hasNext(); ) {
                Letter letter = iterator.next();
                System.out.println(letter.getRecipient());
            }
        }

    }

}


class MailBox {
    List<Letter> letters;

    public MailBox() {
    }

    public MailBox(List<Letter> letters) {
        this.letters = letters;
    }

    public List<Letter> getLetters() {
        if (letters == null || letters != null && letters.size() == 0) {
            return null;
        } else {
            return letters;
        }
    }
}

class Letter {
    private String sender;
    private String recipient;

    public Letter(String sender, String recipient) {
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
}
