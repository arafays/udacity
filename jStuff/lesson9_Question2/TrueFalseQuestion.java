// You are going to add a true/false type question to the question heirachy. Call it
// TrueFalseQuestion
//
// When the quiz is displayed, we want this text to preceed the question.
//     Answer True or False: question here
// We want the "Answer True or False: " to be prepended automatically.
// So if the user sets the text of the question to "Albert Einstein was the inventer of Java."
// the question will be displayed to the user like this
//      Answer True or False: Albert Einstein was the inventer of Java.
//
// Capitalization should not matter when determining if the answer is correct. Also t for true
// and f for false should be accepted.
//
// You will need to override three methods although not everyone will override the
// exact same three methods
//
// You will not need to add instance variables
//
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 9 - Question 2" for some tips on 
// how to begin.
//
public class TrueFalseQuestion extends Question
{
    /**
       Displays this question.
    */
    public void display()
    {
        System.out.print("Answer True or False: ");
        super.display();
    }
    
    /**
       Checks a given response for correctness.
       @param response the response to check
       @return true if the response was correct, false otherwise
    */
    public boolean checkAnswer(String response)
    {
        if( super.checkAnswer( "true" ) && (response.toLowerCase()).equals("t") )
            return true;
        else if ( super.checkAnswer( "false" ) && (response.toLowerCase()).equals("f") )
            return true;
        else
            return super.checkAnswer(response.toLowerCase());
    }
    
     /**
       Sets the answer for this question.
       @param correctResponse the answer
    */
    public void setAnswer(String correctResponse)
    {
        super.setAnswer( correctResponse.toLowerCase() );
    }
}
