package UI;

import java.util.Map;
import static java.util.Map.entry;

public class Msg {
    static final String welcomeMsg = "Добро пожаловать в программу телефонной книги!\n";
    static final String byeMsg = "\nПока!";

    static final String chooseActionsMsg = "Выберите одно из следующих действий:";
    static final String invalidCmdMsg = "Неправильная команда, попробуйте еще раз";

    static final String getCommandMsg = "Введите команду: ";
    static final String getNameMsg = "Введите имя: ";
    static final String getEmailMsg = "Введите адрес электронной почты: ";
    static final String getPhoneNumberMsg = "Введите номер телефона: ";
    static final String invalidEmailMsg = "Ошибка в электронной почте";
    static final String invalidPhoneNumberMsg = "Ошибка с неправильным номером телефона";
    static final String successAddMsg = "Контакт был успешно добавлен в телефонную книгу";
    static final String successEditMsg = "Контакт был успешно отредактирован в телефонной книге";
    static final String successRemovedMsg = "Контакт был успешно удален из телефонной книги";
    static final String ContactFoundMsg = "Найден следующий контакт";
    static final String noContactFoundMsg = "Контакты не найдены";

    static final String showAllContactsMsg = "Следующие контакты были найдены в телефонной книге:";
    static final String editContactMsg = "Чтобы отредактировать контакт, заполните следующие поля:";
    static final String askAddContactMsg = "Контактов с отредактированным именем найдено не было. Добавить новый (y/n): ";

    static final String getSearchStrMsg = "Введите имя для поиска контакта: ";
    static final String notDigitMsg = "Это не цифра, попробуйте еще раз!";
    static final String removeContacMsg = "Следующий контакт будет удален:";
    static final String askRemoveContactMsg = "Ты уверен? (y/n): ";

    static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новый контакт"),
            entry(2, "Измените существующий контакт в коллекции"),
            entry(3, "Удалите контакт из коллекции"),
            entry(4, "Показать все контакты"),
            entry(5, "Показать подробную информацию о контакте"),
            entry(0, "Выход из программы"));

    static final Map<Integer, String> mainMenuEntriesMsg = Map.ofEntries(
            entry(1, "Вы решили добавить новый контакт."),
            entry(2, "Вы решили сменить контакт."),
            entry(3, "Вы решили удалить контакт."),
            entry(4, "Вы выбрали печать всей контактной информации:"),
            entry(5, "Вы выбрали для печати подробную контактную информацию."),
            entry(0, "Пока!"));
}