package com.quizapplication;

public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();
    String[] questionsdata={"Who is the richest president?","What is the planet farthest from the sun?","What is the capital of UNITED STATES OF AMERICA?"};
    String[] options1={"barak obama","pluto","Los angeles"};
    String[] options2={"donald trump","Venus","california"};
    String[] options3={"bill clinton","Mercury","Washington DC"};
    String[] options4={"GW bush","Jupiter","New york"};
    int[] answers={2,1,3};

      public void initGame(){
          //created 3 objects
          for (int i=0; i<3;i++){
              questions[i]=new Question();
          }

     //     applying values to the variables of the object
       questions[0].question="Who is the richest president?";
       questions[0].option1="barak obama";
       questions[0].option2="donald trump";
       questions[0].option3="bill clinton";
       questions[0].option4="GW bush";
       questions[0].correctAnswer=2;

        questions[1].question="What is the planet farthest from the sun?";
        questions[1].option1="pluto";
        questions[1].option2="Venus";
        questions[1].option3="Mercury";
        questions[1].option4="Jupiter";
        questions[1].correctAnswer=1;

        questions[2].question="What is the capital of UNITED STATES OF AMERICA?";
        questions[2].option1="Los angeles";
        questions[2].option2="california";
        questions[2].option3="Washington DC";
        questions[2].option4="New york";
        questions[2].correctAnswer=3;

          for(int i=0;i<3;i++)
          {

              questions[i].question=questionsdata[i];
              questions[i].option1=options1[i];
              questions[i].option2=options2[i];
              questions[i].option3=options3[i];
              questions[i].option4=options4[i];
              questions[i].correctAnswer=answers[i];
          }


      }

    public void play()
    {

        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("you are doing great");
                player.score=player.score+5;
            }
            else{
                System.out.println("aree yaar phir se try karo");
                player.score=player.score-5;
            }
        }

        System.out.println(player.name+" your score is "+player.score);

    }


}
