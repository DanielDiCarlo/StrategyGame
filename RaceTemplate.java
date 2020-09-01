public class RaceTemplate
  {

    private int average = 10;

    int HP;
    int agility;
    int magicAbility;
    int movement;
    int strength;



    public RaceTemplate()
      {
        HP = getAverage();
        agility = getAverage();
        magicAbility = getAverage();
        movement = getAverage();
        strength = getAverage();
      }
    public RaceTemplate(int Health, int Agile, int magic, int move, int strngth)
      {
        HP = Health;
        agility = Agile;
        magicAbility = magic;
        movement = move;
        strength = strngth;
      }

    public int getAverage()
      {
        return(average);
      }
    public int getHP()
      {
          return(HP);
      }
    public int getAgility()
      {
        return(agility);
      }
    public int getMagicAbility()
      {
        return(magicAbility);
      }
    public int getMovement()
      {
        return(movement);
      }
    public int getStrength()
      {
        return(strength);
      }

    public void setHP(int newHP)
      {
        HP = newHP;
      }
    public void setAgility(int newAgility)
      {
        agility = newAgility;
      }
    public void setMagicAbility(int newMagicAbility)
      {
        magicAbility = newMagicAbility;
      }
    public void setMovement(int newMovement)
      {
        movement = newMovement;
      }
    public void setStrength(int newStrength)
      {
        strength = newStrength;
      }

    @Override
    public String toString()
      {
        return( "HP = " + getHP() + "\n" +
                "Agility = " + getAgility() + "\n" +
                "Magic Ability = " + getMagicAbility() + "\n" +
                "Movement = " + getMovement() + "\n" +
                "Strength = " + getStrength() + "\n");
      }

    public static void main(String[] args)
      {
          Human test = new Human();
          System.out.println(test.toString());
      }
  }
