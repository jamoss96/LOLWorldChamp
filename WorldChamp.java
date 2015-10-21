import java.util.ArrayList;

public class WorldChamp {
  
  // The players for Fnatic
  public Team fnatic; 
  public Player huni; 
  public Player reignover; 
  public Player febiven; 
  public Player rekkles; 
  public Player yellowstar; 
 
  //The players for SKT
  public Team skt; 
  public Player marin; 
  public Player bengi; 
  public Player faker; 
  public Player bang; 
  public Player wolf; 
  
  //match shizzle
  public int team1Gold = 0;
  public int team2Gold = 0;
  public int team1Skill = 0;
  public int team2Skill = 0;
  

  
  
  
      public static void main(String args []) throws Exception {
       
         
        
      }
      
      public void init(){
        fnatic = new Team();
        huni = new Player(18, 15, 11, 8.4, Position.TOP, "Huni", fnatic);
        fnatic.add(huni);
        reignover = new Player(12, 13, 16, 4.5, Position.JUNGLE, "Reignover", fnatic);
        fnatic.add(reignover);
        febiven = new Player(15, 16, 12, 9.7, Position.MID, "Febiven", fnatic);
        fnatic.add(febiven);
        rekkles = new Player(12, 16, 12, 9.4, Position.ADC, "Rekkles", fnatic);
        fnatic.add(rekkles);
        yellowstar = new Player(14, 13, 18, 0.5, Position.SUPPORT, "Yellowstar", fnatic);
        fnatic.add(yellowstar);
        
        skt = new Team();
        marin = new Player(16, 16, 13, 8.3, Position.TOP, "marin", skt);
        skt.add(marin);
        bengi = new Player(11, 12, 18, 4.2, Position.JUNGLE, "bengi", skt);
        skt.add(bengi);
        faker = new Player(16, 20, 15, 9.3, Position.MID, "faker", skt);
        skt.add(faker);
        bang = new Player(11, 18, 11, 9.2, Position.ADC, "bang", skt);
        skt.add(bang);
        wolf = new Player(12, 11, 17, 0.45, Position.SUPPORT, "wolf", skt);
        skt.add(wolf);
        

        
        
      }
      
      public void match(){
       
        team1Skill = fnatic.getTeamSkill(team1Skill);
        team2Skill = skt.getTeamSkill(team2Skill);
        System.out.println(team1Skill);
        System.out.println(team2Skill);
        
      }
      
      public void simup2Min(){
        
        
        
      }
      
}

class Team {
  
  public ArrayList<Player> players;
  private Player player;
  Team(){
    players = new ArrayList<Player>();
  }
  
  public void add(Player player){
    players.add(player);
  }
  
  public Player get(String name){
    for(Player player:players)
      {
      if(name.equals(player.getName()))
        {
        return player;
      }
      }
      return null;
    }
  
  public int getTeamSkill(int skill){
    for(Player player:players)
      {
      skill = skill + player.getAgg();
      skill = skill + player.getMec();
      skill = skill + player.getKno();
    }
    return skill;
  }
}
 



class Player {
  
  private int agg;
  private int mec;
  private int kno;
  private double cspm;
  private Position pos;
  private String name;
  
  Player(int agg, int mec, int kno, double cspm, Position position, String name, Team team){
  this.agg = agg;
  this.mec = mec;
  this.kno = kno;
  this.cspm = cspm;
  this.pos = position;
  this.name = name;
  }
  
  public int getAgg(){
    return agg;
  }
  
  public int getMec(){
    return mec;
  }
  
  public int getKno(){
    return kno;
  }
  
  public double getCspm(){
    return cspm;
  }
  
  public Position getPos(){
    return pos;
  }
  
  public String getName(){
    return name;
  }
}

enum Position{
  TOP, JUNGLE, MID, ADC, SUPPORT
}
