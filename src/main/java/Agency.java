public abstract class Agency {

   public abstract  String getAGENCY();
   public abstract String getID();
   public abstract int getScore();

   //Provide output when product is called
   @Override
   public String toString() {
      return "\n" + this.getAGENCY() + " Product:\n" + "ID: " + this.getID() + "\nScore: " + this.getScore();
   }

}

