import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        Movie movie = new Movie("Your Name");
//        movie.watchMovie();

//        Movie adventure = new Adventure("Harry Potter");
//        adventure.watchMovie();

//        Movie theMovie = Movie.getMovie("Adventure","Harry Potter");
//        theMovie.watchMovie();

        Scanner scrn = new Scanner(System.in);
        while(true){
            System.out.println("Enter the type (A for Adventure, C for Comedy, "+"S for Science Fiction, or Q for Quit): ");
            String type = scrn.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter the movie title: ");
            String title = scrn.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }

    }
}