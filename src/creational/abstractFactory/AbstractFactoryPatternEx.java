package creational.abstractFactory;

public class AbstractFactoryPatternEx {

    // GoF Definition: Provides an interface for creating families of related or dependent objects
    // without specifying their concrete classes.

    // concept: In this pattern, we provide an encapsulation mechanism to a group of individual factories.
    // These factories have a theme in common.
    // In this process, an interface is used to create related objects.
    // Here we do not call their implementer or concrete classes directly.
    // We sometimes refer to this pattern as a factory of factories or a Super factory.
    // With this pattern, we can interchange the specific implementations without changing the user’s code.
    // But to achieve this, we need to compensate for the complexity of the system.
    // As a result, debugging may be difficult in many scenarios.

    // Real-Life Example
    // Suppose we are decorating our room.
    // Now suppose we need two different types of almirah (or, say, table)—
    // one must be made of wood and one of steel. For the wooden almirah, we need to visit a carpenter shop
    // and for the other type, we can go to a readymade steel almirah shop.
    // Both of these are almirah (or table) factories.
    // Based on our demand, we decide what kind of factory we need.
    // This scenario can be considered an example of this pattern.

    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo***");
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        ITollywoodMovie tAction = actionMovies.GetTollywoodMovie();
        IBollywoodMovie bAction = actionMovies.GetBollywoodMovie();

        System.out.println("\nAction movies are:");
        System.out.println(tAction.MovieName());
        System.out.println(bAction.MovieName());
        ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
        ITollywoodMovie tComedy = comedyMovies.GetTollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.GetBollywoodMovie();
        System.out.println("\nComedy movies are:");
        System.out.println(tComedy.MovieName());
        System.out.println(bComedy.MovieName());
    }

}
