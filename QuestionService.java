import java.util.*;
public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    public QuestionService() {
        questions[0] = new Question(1, "Which data structure follows LIFO property ?", 
        new ArrayList<>(Arrays.asList("Stack", "Queue", "Binary Tree", "LinkedList")), "Stack");
        questions[1] = new Question(2, "The default non-initialized value in a char array is ?", 
        new ArrayList<>(Arrays.asList("Null", "0", "0.00", "0L")), "Null");
        questions[2] = new Question(3, "Which of the following is not an object oriented language ?", 
        new ArrayList<>(Arrays.asList("Java", "C++", "C", "Python")), "C");
        questions[3] = new Question(4, "Which data structure has a dynamic memory allocation ?", 
        new ArrayList<>(Arrays.asList("ArrayList", "Stack", "Array", "Queue")), "ArrayList");
        questions[4] = new Question(5, "The smallest representation of a number in Java is ?", 
        new ArrayList<>(Arrays.asList("int", "byte", "short", "long")), "byte");
    }
    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int score = 0;
        for(Question q : questions) {
            Collections.shuffle(q.getOptions());
            System.out.println();
            System.out.print("QUESTION " +  q.getId() + " : ");
            System.out.println(q.getQuestion());
            char k = 'a';
            for(String s : q.getOptions()) {
                System.out.println("(" + k++ + ")" + " " + s);
            }
            System.out.println();
            System.out.print("ENTER THE ANSWER: ");
            selection[i] = sc.nextLine();
            if(selection[i].equals(q.getAnswer())) {
                score++;
            }
            i++;
        }
        sc.close();
        System.out.println();
        System.out.println("ANSWERS ENTERED: ");
        char j = 'a';
        for(String s : selection) {
            System.out.println("(" + j++ + ")" + " " + s);
        }
        System.out.println();
        System.out.print("YOUR TOTAL SCORE IS: " + score);

    }
}
