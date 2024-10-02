//Интерфейс расписания фильмов который взаимствует свойства интерфейса клон
public interface MovieSchedule extends Cloneable {
    //Метод клонирования расписания
    MovieSchedule clone();
    //Сеттер для фильма
    void setMovie(Movie movie);
    //Тот же для времени
    void setTime(String time);
    //Метод принта расписания
    void printSchedule();
}