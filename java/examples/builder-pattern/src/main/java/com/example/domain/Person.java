package com.example.domain;

/**
 * Created by tjkemper on 4/5/17.
 */
public class Person {

    private String first;
    private String middle;
    private String last;
    private int age;
    private String hair;
    private String eyes;
    private int height; //inches

    public Person(){}

    public Person(String first, String middle, String last, int age, String hair, String eyes, int height) {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.age = age;
        this.hair = hair;
        this.eyes = eyes;
        this.height = height;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (first != null ? !first.equals(person.first) : person.first != null) return false;
        if (middle != null ? !middle.equals(person.middle) : person.middle != null) return false;
        if (last != null ? !last.equals(person.last) : person.last != null) return false;
        if (hair != null ? !hair.equals(person.hair) : person.hair != null) return false;
        return eyes != null ? eyes.equals(person.eyes) : person.eyes == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (middle != null ? middle.hashCode() : 0);
        result = 31 * result + (last != null ? last.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (hair != null ? hair.hashCode() : 0);
        result = 31 * result + (eyes != null ? eyes.hashCode() : 0);
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", middle='" + middle + '\'' +
                ", last='" + last + '\'' +
                ", age=" + age +
                ", hair='" + hair + '\'' +
                ", eyes='" + eyes + '\'' +
                ", height=" + height +
                '}';
    }

    private Person(Builder b) {
        this.first = b.first;
        this.middle = b.middle;
        this.last = b.last;
        this.age = b.age;
        this.hair = b.hair;
        this.eyes = b.eyes;
        this.height = b.height;
    }

    public static class Builder{
        private String first;
        private String middle;
        private String last;
        private int age;
        private String hair;
        private String eyes;
        private int height; //inches

        public Builder first(String first) {
            this.first = first;
            return this;
        }
        public Builder middle(String middle) {
            this.middle = middle;
            return this;
        }
        public Builder last(String last) {
            this.last = last;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder hair(String hair) {
            this.hair = hair;
            return this;
        }
        public Builder eyes(String eyes) {
            this.eyes = eyes;
            return this;
        }
        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
