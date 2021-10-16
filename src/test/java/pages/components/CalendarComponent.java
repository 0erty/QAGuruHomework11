package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    private SelenideElement dateOfBirthField = $("#dateOfBirthInput"),
                            monthDropdown = $(".react-datepicker__month-select"),
                            yearDropdown = $(".react-datepicker__year-select");

    public void chooseDateOfBirth(String day, String month, String year) {
        dateOfBirthField.shouldBe(Condition.exist).click();
        monthDropdown.selectOption(month);
        yearDropdown.selectOption(year);
        $(".react-datepicker__day.react-datepicker__day--0" + day).click();
    }
}
