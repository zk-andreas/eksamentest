package com.riddles.Model;

import java.util.Objects;

public class User implements Comparable<User> {
    private String fornavn;
    private String efternavn;
    private String email;
    private int tlfNummer;

    public User(String fornavn, String efternavn, String email, int tlfNummer) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.email = email;
        this.tlfNummer = tlfNummer;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTlfNummer() {
        return tlfNummer;
    }

    public void setTlfNummer(int tlfNummer) {
        this.tlfNummer = tlfNummer;
    }

    @Override
    public String toString() {
        return "User{" +
                "fornavn='" + fornavn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                ", email='" + email + '\'' +
                ", tlfNummer=" + tlfNummer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public int compareTo(User o) {
        int firstCompare = getFornavn().compareTo(o.getFornavn());
        if (firstCompare != 0) {
            return firstCompare;
        }
        int lastCompare = getEfternavn().compareTo(o.getEfternavn());
        if (lastCompare != 0) {
            return lastCompare;
        }
        return getEmail().compareTo(o.getEmail());
    }
}
