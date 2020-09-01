public class Human extends RaceTemplate
{
  private int baseHP = 1;
  private int baseAgility = 2;
  private int baseMagicAbility = 3;
  private int baseMovement = 4;
  private int baseStrength = 5;

  public Human()
    {
      super();
      super.setHP(baseHP);
      super.setAgility(baseAgility);
      super.setMagicAbility(baseMagicAbility);
      super.setMovement(baseMovement);
      super.setStrength(baseStrength);
    }

}
//;
