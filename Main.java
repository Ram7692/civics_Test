import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Test c = new Test();
         c.logic();


    }

}

class Test {

    Scanner userInput = new Scanner(System.in);
    int correctAnswerTotal = 0;
    int wrongAnswerTotal = 0;
    public void logic() {
        CivicQuiz q1 = new CivicQuiz("The House of Representatives belong to which branch of Government?", "A. Legislative", "B. Executive", "C. Parliamentary", "D. Judicial");

        CivicQuiz q2 = new CivicQuiz("The President belongs to which branch of Government?", "A. Legislative", "B. Executive", "C. Parliamentary", "D. Judicial");

        CivicQuiz q3 = new CivicQuiz("The Senate belongs to which branch of Government?", "A. Legislative", "B. Executive", "C. Parliamentary", "D. Judicial");

        CivicQuiz q4 = new CivicQuiz("Which of these is not a branch of the United States Government?", "A. Legislative", "B. Executive", "C. Parliamentary", "D. Judicial");

        CivicQuiz q5 = new CivicQuiz("The Supreme Court of the United States belongs to which branch of Government?", "A. Legislative", "B. Executive", "C. Parliamentary", "D. Judicial");

        CivicQuiz q6 = new CivicQuiz("Election Day is held on which Tuesday in November?", "A. First", "B. Second", "C. Third", "D. Fourth");

        CivicQuiz q7 = new CivicQuiz("The United States of America is... ", "A. A Democracy", "B. A Constitutional Republic", "C. A Theocracy", "D. A Monarchy");

        CivicQuiz q8 = new CivicQuiz("The House of Representatives is meant to represent...", "A. The President", "B. The States", "C. The People", "D. The Corporations");

        CivicQuiz q9 = new CivicQuiz("The United States Senate is meant to represent...", "A. The President", "B. The States", "C. The People", "D. The Corporations");

        CivicQuiz q10 = new CivicQuiz("Representatives serve a term of...", "A. 8 years", "B. 6 years", "C. 4 years", "D. 2 years");

        CivicQuiz q11 = new CivicQuiz("United States Senators serve a term of...", "A. 8 years", "B. 6 years", "C. 4 years", "D. 2 years");

        CivicQuiz q12 = new CivicQuiz("United States Presidents serve a term of...", "A. 8 years", "B. 6 years", "C. 4 years", "D. 2 years");

        CivicQuiz q13 = new CivicQuiz("When selected by the President, who votes for new Supreme Court Justice Nominee's?", "A. The People", "B. The Corporations", "C. The Senate", "D. The Representatives");

        CivicQuiz q14 = new CivicQuiz("How Long is Supreme Court Members Term?", "A. 8 years", "B. 16 years", "C. 24 years", "D. no limit");

        CivicQuiz q15 = new CivicQuiz("Whom writes the new laws?", "A. Congress", "B. The President", "C. The Supreme Court", "D. The Corporations");

        CivicQuiz q16 = new CivicQuiz("Who signs the new laws?", "A. Congress", "B. The President", "C. The Supreme Court", "D. The Corporations");

        CivicQuiz q17 = new CivicQuiz("Whom determines if the new laws are constitutional?", "A. Congress", "B. The President", "C. The Supreme Court", "D. The Corporations");

        CivicQuiz q18 = new CivicQuiz("From smallest to greatest, which order of the three governments is correct?", "A. federal, local, state", "B. state, local, federal", "C. local, federal, state", "D. local, state, federal");

        CivicQuiz q19 = new CivicQuiz("Where is the federal government located?", "A. New York City", "B. Washington D.C.", "C. Cleveland", "D. Philadelphia");


        Map<CivicQuiz, Character> correctAnswers = new HashMap<>();
        correctAnswers.put(q1, 'A');
        correctAnswers.put(q2, 'B');
        correctAnswers.put(q3, 'A');
        correctAnswers.put(q4, 'C');
        correctAnswers.put(q5, 'D');
        correctAnswers.put(q6, 'B');
        correctAnswers.put(q7, 'B');
        correctAnswers.put(q8, 'C');
        correctAnswers.put(q9, 'B');
        correctAnswers.put(q10, 'D');
        correctAnswers.put(q11, 'B');
        correctAnswers.put(q12, 'C');
        correctAnswers.put(q13, 'C');
        correctAnswers.put(q14, 'D');
        correctAnswers.put(q15, 'A');
        correctAnswers.put(q16, 'B');
        correctAnswers.put(q17, 'C');
        correctAnswers.put(q18, 'D');
        correctAnswers.put(q19, 'B');

        for(Map.Entry<CivicQuiz, Character> map:correctAnswers.entrySet()) {
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOptionOne());
            System.out.println(map.getKey().getOptionTwo());
            System.out.println(map.getKey().getOptionThree());
            System.out.println(map.getKey().getOptionFour());

            System.out.println("Enter the letter belonging to the correct answer, Capitalization counts!!! ");
            Character answer = userInput.next().charAt(0);

            int words = Character.compare(answer, map.getValue());

            if (words == 0) {
                System.out.println("Correct");
                correctAnswerTotal++;
            }
            else {
                System.out.println("Incorrect");
                wrongAnswerTotal++;
            }
        }
        System.out.println();
        System.out.println("Here are your Results!");
        System.out.println("Total Questions: "+correctAnswers.size());
        System.out.println("Correct Answered: "+correctAnswerTotal);
        System.out.println("Wrong Answered: "+wrongAnswerTotal);
        System.out.println("Your Score: "+(100 * correctAnswerTotal) / correctAnswers.size());
        System.out.println("---------See---Below----------");
        int finalScore = (100 / correctAnswerTotal) / correctAnswers.size();
        if (finalScore >= 70) {
            System.out.println("Congratulations! You have a great understanding of US Civics!");
        }
        else {
            System.out.println("Needs improvement to properly understand how US civics work.");
        }
    }
}
