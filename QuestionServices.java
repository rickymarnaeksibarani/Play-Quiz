import java.util.Scanner;

public class QuestionServices {
    Question[] question = new Question[5];
    String selection[] = new String[5];

    public QuestionServices()
    {
        question[0]= new Question(1, "What the course main? ", "Java core with Springboot", "python","java.net", "C#", "Java core with Springboot");
        question[1]= new Question(2, "What is my name?", "sakalaka", "Ricky ","vincent", "galang ", "Ricky");
        question[2]= new Question(3, "What how old im?", "23", "32 ","2023", "2024", "23");
        question[3]= new Question(4, "What my roll in GMF unit TD?", "SAP", "QA","Analyst", "Programmer", "Programmer");
        question[4]= new Question(5, "What my hobby?", "Basket", "Badminton","Dance", "jumpping", "Basket");
    }
    public void Playquiz()
    {
        int i=0;
        System.out.println("=====Display Question=====");
        for (Question q : question) {
            System.out.println("NO. "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.print("Write your answer: ");
            Scanner scr = new Scanner(System.in);
            selection[i]= scr.nextLine();
            i++;
            
        }
            System.out.println("Your Answer: ");
            for (String s : selection) {
                System.out.println(s);
            }
        
        
    }
    public void printScore()
    {
        int score = 0;
        for (int i=0; i<question.length; i++) {
            Question que = question[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
            
        }
        System.out.println("Your Score: "+score);
    }
}
