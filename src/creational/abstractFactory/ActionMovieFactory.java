package creational.abstractFactory;

public class ActionMovieFactory implements IMovieFactory {
    @Override
    public ITollywoodMovie GetTollywoodMovie() {
        return new TollywoodActionMovie();
    }

    @Override
    public IBollywoodMovie GetBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
