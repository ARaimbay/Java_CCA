class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    Language(String langName, int speakers, String regions, String wdOrder){
      this.name = langName;
      this.numSpeakers = speakers;
      this.regionsSpoken = regions;
      this.wordOrder = wdOrder;
    }
    public static void main(String[] args){
      Language spanish = new Language("Spanish", 5550000, "Spain, Latin America and Guinea", "subject-verb-objet");
      spanish.getInfo();

      Language kazakh = new Language("Kazakh", 19000000, "Kazakhstan", "subject-object-verb");
      kazakh.getInfo();

      Mayan kiche = new Mayan("Ki'che'", 2330000);
      kiche.getInfo();

      SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000);
      mandarin.getInfo();
      SinoTibetan burmese = new SinoTibetan("Burmese", 430000);
      burmese.getInfo();

  
    }
    public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
      System.out.println("The language follows the word order: " + this.wordOrder);
    }
  }