import java.util.Arrays;
import java.util.ArrayList;
class Playlist {
  public static void main(String[] args) {
    String[] favoriteSongs = {"Maltese", "Cavachon", "German Shepherd", "Beagle", "Poodle", "Bulldog", "Boxer", "Siberian Husky", "Dachshund", "Shih Tzu"};
    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2]);

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Hello");
    desertIslandPlaylist.add("Its");
    desertIslandPlaylist.add("Me");
    desertIslandPlaylist.add("Love");
    desertIslandPlaylist.add("Halo");
    
    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Cavachon");
    desertIslandPlaylist.remove("Boxer");
    desertIslandPlaylist.remove("Shih Tzu");
    desertIslandPlaylist.remove("Poodle");
    desertIslandPlaylist.remove("German Shepherd");
    desertIslandPlaylist.remove("Halo");
    desertIslandPlaylist.remove("Its");
    desertIslandPlaylist.remove("Bulldog");
    desertIslandPlaylist.remove("Beagle");
    desertIslandPlaylist.remove("Dachshund");
    System.out.println(desertIslandPlaylist);
    int SongA = desertIslandPlaylist.indexOf("Hello");
    int SongB = desertIslandPlaylist.indexOf("Maltese");
    String tempA = "Hello";
    desertIslandPlaylist.set(SongA, "Maltese");
    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(SongA, tempA);
    System.out.println(desertIslandPlaylist);

  }
  
}
