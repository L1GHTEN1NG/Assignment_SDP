//Фабрика для типа фильмов аймакс, который взаимствует свойства абстрактного класса.
class IMAXMovieFactory extends MovieFactory {
    //Создает новый фильм и выводит его по тайтлу.
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}