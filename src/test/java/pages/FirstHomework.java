package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import pages.components.CalendarComponent;
import tests.TestBase;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static tests.TestData.*;
import static utils.RandomUtils.getRandomPhone;
import static utils.RandomUtils.getRandomSubject;

public class FirstHomework {

    public CalendarComponent calendar = new CalendarComponent();
    Faker faker = new Faker();

    private SelenideElement formTitle = $("h5"),
                            firstNameField = $("#firstName"),
                            lastNameFiled = $("#lastName"),
                            emailField = $("#userEmail"),
                            maleGenderRadioButton = $(".custom-control-label"),
                            mobileNumberField = $("#userNumber"),
                            subjectsField = $("#subjectsInput"),
                            firstSubjectResult = $("#react-select-2-option-0"),
                            hobbiesCheckbox = $("#hobbiesWrapper"),
                            fileForm = $("#uploadPicture"),
                            addressField = $("#currentAddress"),
                            closeAdButton = $("#close-fixedban"),
                            stateDropdown = $("#state"),
                            cityDropdown = $("#city"),
                            secondStateOption = $("#react-select-3-option-3"),
                            firstCityOption = $("#react-select-4-option-1"),
                            submitButton = $("#submit"),
                            resultTable = $ (".table"),
                            resultTableTitle = $("#example-modal-sizes-title-lg");
    private final String firstName = faker.name().firstName(),
                         lastName = faker.name().lastName(),
                         email = faker.internet().emailAddress(),
                         phoneNumber = getRandomPhone(),
                         address = faker.address().fullAddress(),
                         subject = getRandomSubject();

    @Step ("???????????????? ?????????????? ????????????????")
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
         formTitle.shouldHave(text(pageTitle));
    }

    @Step("???????????????????? ?????????? ??????")
    public void fillNameFields() {
        firstNameField.setValue(firstName);
        lastNameFiled.setValue(lastName);
    }

    @Step("???????????????????? ???????? email")
    public void fillEmailField() {
        emailField.setValue(email);
    }

    @Step("???????????????????? ????????")
    public void chooseGender() {
        maleGenderRadioButton.shouldBe(Condition.exist).click();
    }

    @Step("???????????????????? ???????? ???????????????????? ????????????????")
    public void fillMobileNumberField() {
        mobileNumberField.shouldBe(visible).setValue(phoneNumber);
    }

    @Step("?????????? ??????????????????")
    public void chooseSubjects() {
        subjectsField.setValue(subject);
        firstSubjectResult.click();
    }

    @Step("?????????? ??????????")
    public void chooseHobbies() {
        hobbiesCheckbox.$(byText("Sports")).click();
        hobbiesCheckbox.$(byText("Reading")).click();
    }

    @Step("???????????????? ????????????????")
    public void uploadPicture() {
        fileForm.uploadFile(new File("src/test/resources/elon_musk.jpg"));
    }

    @Step("???????????????????? ????????????")
    public void fillFullAddress() {
        addressField.setValue(address);
        closeAdButton.click();
        stateDropdown.click();
        secondStateOption.click();
        cityDropdown.click();
        firstCityOption.click();
    }

    @Step("???????? ??????????????")
    public void clickSubmitButton() {
        submitButton.click();
    }

    @Step("???????????????? ??????????????????????")
    public void checkResultTable() {
        resultTableTitle.shouldBe(visible).shouldHave(text(thanksTableMessage));
        resultTable.$(byText(fullNameLineTitle)).shouldBe(exist);
        resultTable.$(byText(firstName + " " + lastName)).shouldBe(exist);
    }
}
