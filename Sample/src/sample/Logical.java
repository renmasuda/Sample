package sample;

public class Logical {

    public static void main(String[] args) {
        int score=59;
        
        System.out.println("scoreが４０以上、かつ５０以下：");
        System.out.println(score>=40&&score<=50);
        
        System.out.println("scoreが４０以上、または５０以下：");
        System.out.println(score>=40||score<=50);
        
        System.out.println("scoreが６０以上ではない：");
        System.out.println(!(score>=60));

    }

}
