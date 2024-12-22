public class NextMain {
    public static void main(String[] args) {
        Movie themovie = Movie.getMovie("A","Jaws");
        themovie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","PK");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
