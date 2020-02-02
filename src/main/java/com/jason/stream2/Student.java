package com.jason.stream2;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "student: { name='" + name + "', score='" + score + "'}";
    }
}
