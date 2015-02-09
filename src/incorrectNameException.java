
public class incorrectNameException extends Exception {
   private String name;
   public incorrectNameException() {}
   
   
   public incorrectNameException(String name){
	   super(name + " does not have either a first name or a last name");
	   this.name = name;
   }

@Override
   public String toString() {
	return "incorrectNameException [name=" + name + "]";
  }
}
