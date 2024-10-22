package org.example;

public class Student {
    private String id;
    private String name;
    private double marks;
    private String rank;

    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.rank = calculateRank(marks);
    }

    private String calculateRank(double marks) {
        if (marks >= 0 && marks < 5.0) return "Fail";
        if (marks >= 5.0 && marks < 6.5) return "Medium";
        if (marks >= 6.5 && marks < 7.5) return "Good";
        if (marks >= 7.5 && marks < 9.0) return "Very Good";
        return "Excellent";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String getRank() {
        return rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        this.rank = calculateRank(marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Marks=" + marks +
                ", Rank='" + rank + '\'' +
                '}';
    }
}
