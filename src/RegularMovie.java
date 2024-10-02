//Еще один вид фильма, обычный. Который заимствует у интерфейса муви.
class RegularMovie implements Movie {
    //Ячейка для тайтла
    private String title;

    //Конструктор для фильма
    public RegularMovie(String title) {
        this.title = title;
    }

    //Геттер для вывода тайтла
    public String getTitle() {
        return title;
    }

    //Геттер для вывода типа фильма
    public String getType() {
        return "Regular";
    }
}