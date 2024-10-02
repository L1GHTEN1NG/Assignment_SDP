//Фабрика для обычного типа фильмов, который взаимствует свойства абстрактного класса.
class RegularMovieFactory extends MovieFactory {
    //Создает новый фильм и выводит его по тайтлу.
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}