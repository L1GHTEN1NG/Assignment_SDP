//Класс для бронирования билетов на фильмы
public class TicketBooking {
    //Элементы класса номер стула, тайтл фильма и комбо снэков
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    //Конструктор этого класса для сохранения значений элементов с помощью билдера
    private TicketBooking(TicketBookingBuilder builder) {
        this.movieTitle = builder.movieTitle;
        this.seatNumber = builder.seatNumber;
        this.snackCombo = builder.snackCombo;
    }

    // Геттеры для получения значений элементов
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSnackCombo() {
        return snackCombo;
    }

    //Метод для вывода значений на экран наших элементов
    public String toString() {
        return "TicketBooking{" + "movieTitle='" + movieTitle + '\'' + ", seatNumber='" + seatNumber +
                '\'' + ", snackCombo='" + snackCombo + '\'' + '}';
    }

    //Отдельный класс билдер билетов
    public static class TicketBookingBuilder {
        //У него также есть элементы которые потом сохраняются сверху в коде
        private String movieTitle;
        private String seatNumber;
        private String snackCombo;

        //Сеттеры значений элементов
        public TicketBookingBuilder setMovieTitle(String movieTitle) {
            this.movieTitle = movieTitle;
            return this;
        }

        public TicketBookingBuilder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public TicketBookingBuilder setSnackCombo(String snackCombo) {
            this.snackCombo = snackCombo;
            return this;
        }

        //Также собственный метод класса под названием билд, который возвращает созданный билет
        public TicketBooking build() {
            return new TicketBooking(this);
        }
    }
}