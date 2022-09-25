package oop.homework4.stream;

public class Student {
    private String name;
    private int age;
    private double mathScore;
    private double historyScore;

    public Student() {

    }

    public Student(String name, int age, double mathScore, double historyScore) {
        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
        this.historyScore = historyScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(double historyScore) {
        this.historyScore = historyScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mathScore=" + mathScore +
                ", historyScore=" + historyScore +
                '}';
    }

    public double gpa() {
        return (mathScore + historyScore) / 2;
    }
}
