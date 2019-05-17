package custom;
public class InvalidTestScores

  extends Exception

{

  public InvalidTestScores()

  {

    super("Error : Invalid Test Scores");

  }

   

  public InvalidTestScores(double invalid)

  {

    super("Error : Invalid Test Scores: " + invalid);

  }

   

  

   

   

}

