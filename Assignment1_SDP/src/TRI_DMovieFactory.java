//Фабрика для типа фильмов 3д, который взаимствует свойства абстрактного класса.
class TRI_DMovieFactory extends MovieFactory {
    //Создает новый фильм и выводит его по тайтлу.
    public Movie createMovie(String title) {
        return new TRI_DMovie(title);
    }
}