import imonsh.*;

public class HolaMundo {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();

        String str;
        screen.out("Bienvenidos a la mision Backend en JAVA\n\n","Helvetica",28,Colors.Desire);
        screen.setVisible(true);

        str = d.readString("Quieres aprender a hacer esto?\n");

        if (str.charAt(0) == 'S' || str.charAt(0) == 's'){
            screen.showImage("C:\\Users\\menad\\Documentos\\Azure\\LaunchX\\Back\\Interfaz\\src\\perritu.jpg");
            screen.out("\nHola Explorers");
        }else
            screen.out("Tal vez en otro momento, Adios!","Century Schoolbook", 28,Colors.blue);
    }
}