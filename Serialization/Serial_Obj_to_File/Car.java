import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;

  public static void main(String[] args) throws FileNotFoundException, IOException {
  }
}