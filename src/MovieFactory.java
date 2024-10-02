//Абстрактный класс Фабрика Фильмов, который создает фильм по тайтлу.
abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}