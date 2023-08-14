package HW_Les_6.data;

import HW_Les_6.operations.AddBook;
import HW_Les_6.operations.FileSafe;
import HW_Les_6.operations.OutAllBooks;
import HW_Les_6.operations.RemoveBook;

public class Menu {

    BookRepository ui;

    public Menu() {
        ui = new InMemoryBookRepository();
    }
    
    public void start() throws Exception {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Добавление книги\n")
                .append("2 - Удаление книги\n")
                .append("3 - Вывод списка книг\n")
                .append("4 - Сохранение книг в файл по авторам\n")
                .append("0 - exit\n");
                
        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    AddBook.addBook();
                    break;
                case "2":
                    RemoveBook.removeBook();
                    return;
                case "3":
                    OutAllBooks.getAllBooks();
                    return;
                case "4":
                    FileSafe.fileSafe();
                    return;
                case "0":
                    return;
                default:
                    return;
            }   
        }
    }
}
