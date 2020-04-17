package ringo.day16.treeset;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/17 20:54
 */
public class Student {
    private String name;
    private int chineseScore;
    private int mathScore;
    private int englishScore;

    public Student() {
    }

    public Student(String name, int chineseScore, int mathScore, int englishScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getSum() {
        int sum = this.chineseScore + this.englishScore + this.mathScore;
        return sum;
    }
}
