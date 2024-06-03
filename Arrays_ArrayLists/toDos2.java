import java.util.ArrayList;

public class toDos2 {
    public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    //toDoList.add(toDo2, "Play tennis");
    String toDo2 = "Play tennis";
    
    // Add to-dos to toDoList
   //toDoList.add(toDo3, "Code");
   String toDo3 = "Code";
   toDoList.add(toDo1);
   toDoList.add(toDo2);
   toDoList.add(toDo3);
    
    System.out.println(toDoList);
      
    
  }
}
