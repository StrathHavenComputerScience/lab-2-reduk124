public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    cleanFive();
    Robot.turnLeft();
    cleanFive();
    Robot.turnLeft();
    cleanFive();
    Robot.turnLeft();
    cleanFive();
    
   
    
    //INSERT CODE HERE
  }
  
  public static void cleanForward()
  {
        Robot.move();
        Robot.makeLight();
  }
  
  public static void cleanFive()
  {
      cleanForward();
      cleanForward();
      cleanForward();
      cleanForward();
      cleanForward();
      Robot.move();
    }
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    turnRight();
    darkenRow();
    darken2col();
    darkenRow();
    darken2col();
    darkenRow();
    darken2col();
    darkenRow();
    darken2col();
    darkenRow();
    
    //INSERT CODE HERE
  }
  public static void turnRight()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
  }
  public static void darkenRow()
  {
      Robot.makeDark();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.makeDark();
      turnAround();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      turnRight();
  }
  public static void darken2col()
  {
      Robot.move();
      Robot.makeDark();
      Robot.move();
      turnRight();
    }
  public static void turnAround()
  {
      Robot.turnLeft();
      Robot.turnLeft();
    }
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    turnRight();
    checkerRow();
    oddRowToEvenRow();
    checkerRow();
    evenRowToOddRow();
    checkerRow();
    oddRowToEvenRow();
    checkerRow();
    evenRowToOddRow();
    checkerRow();
    oddRowToEvenRow();
    checkerRow();
    evenRowToOddRow();
    checkerRow();
    oddRowToEvenRow();
    checkerRow();
    //INSERT CODE HERE
  }
  public static void checkerRow()
  {
      Robot.makeDark();
      Robot.move();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.move();
      Robot.makeDark();
      Robot.move();
    }
  public static void oddRowToEvenRow()
  {
      Robot.turnLeft();
      Robot.move();
      Robot.turnLeft();
    }
  public static void evenRowToOddRow()
  {
      turnRight();
      Robot.move();
      turnRight();
    }
}
