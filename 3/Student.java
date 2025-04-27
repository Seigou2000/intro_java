class Student{
    String name;
    int engScore;
    int mathScore;

    void display(){
        System.out.println(name);
        System.out.println("English" + engScore + ", math" + mathScore);
    }
    void setScore(int eng, int math){
        engScore = eng;
        mathScore = math;
    }
    double getAve(){
        double avg = (engScore + mathScore) / 2.0;
        return avg;
    }
}
