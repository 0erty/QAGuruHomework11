package tests;

import org.junit.jupiter.api.Test;
import pages.FirstHomework;

public class FirstHomeworkTest extends TestBase {
    FirstHomework firstHomework = new FirstHomework();

    @Test
    void studentFormTest() {
        firstHomework.openPage();
        firstHomework.fillNameFields();
        firstHomework.fillEmailField();
        firstHomework.chooseGender();
        firstHomework.fillMobileNumberField();
        firstHomework.chooseSubjects();
        firstHomework.chooseHobbies();
        firstHomework.uploadPicture();
        firstHomework.fillFullAddress();
        firstHomework.clickSubmitButton();
        firstHomework.checkResultTable();
    }
}
