class StuSample {
    public static void main(String[] args){
        Student stu1 = new Student();

        stu1.name = "Sugawara";
        stu1.setScore(90, 80);

        stu1.display();
        System.out.println("average" + stu1.getAve());
    }
}