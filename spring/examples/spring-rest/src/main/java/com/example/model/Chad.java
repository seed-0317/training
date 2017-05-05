package com.example.model;

public class Chad {
    private String name;
    private String joke;

    public Chad() {
    }

    public Chad(String name, String joke) {
        this.name = name;
        this.joke = joke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chad chad = (Chad) o;

        if (name != null ? !name.equals(chad.name) : chad.name != null) return false;
        return joke != null ? joke.equals(chad.joke) : chad.joke == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (joke != null ? joke.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Chad{" +
                "name='" + name + '\'' +
                ", joke='" + joke + '\'' +
                '}';
    }
}
