public class CinemaConfig {
    //Я создал интанс согласна первому пункту
    private static CinemaConfig instance;

    //Дальше я создал свои поля для этого класса: название, количество скринов, время, год и имя автора
    private String CinemaName;
    private int NumberOfScreens;
    private String OperatingHours;
    private int PublishedYear;
    private String AuthorName;

    //Потом идет конструктор этого класса с дефолтными настройками
    private CinemaConfig() {
        this.CinemaName = "Ironman";
        this.NumberOfScreens = 20;
        this.OperatingHours = "01:00 PM - 02:45 PM";
        this.PublishedYear = 2008;
        this.AuthorName = "Jon Favreau";
    }

    //Также метод для работы с инстенсом, который его возвращает. Но, если его нет, создает новый.
    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    //Геттеры и сеттеры основных параметров этого класса
    public void setCinemaName(String name) {
        this.CinemaName = name;
    }

    public String getCinemaName() {
        return CinemaName;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.NumberOfScreens = numberOfScreens;
    }

    public int getNumberOfScreens() {
        return NumberOfScreens;
    }

    public void setOperatingHours(String hours) {
        this.OperatingHours = hours;
    }

    public String getOperatingHours() {
        return OperatingHours;
    }

    public void setPublishedYear(int YearOfPublish) {
        this.PublishedYear = YearOfPublish;
    }

    public int getPublishedYear() {
        return PublishedYear;
    }

    public void setAuthorName(String author) {
        this.AuthorName = author;
    }

    public String getAuthorName() {
        return AuthorName;
    }
}
