//Это уже раписание стандартного вида, которое берет свойства интерфейса МувиСкеджуал
public class StandardSchedule implements MovieSchedule {
    //Элементы данного класса фильм и время
    private Movie movie;
    private String time;

    //Метод клон который проверяет его на правило клонирования, если нет то ноль
    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Сеттеры для фильма и времени
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    //Отдельный метод для вывода расписания
    public void printSchedule() {
        System.out.println("Movie: " + (movie != null ? movie.getTitle() : "No movie") + ", Time: " + time);
    }
}
