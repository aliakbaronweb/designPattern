package creational.abstractFactory;

public interface IMovieFactory {
    ITollywoodMovie GetTollywoodMovie();

    IBollywoodMovie GetBollywoodMovie();

}
