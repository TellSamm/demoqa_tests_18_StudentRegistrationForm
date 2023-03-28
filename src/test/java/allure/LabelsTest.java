package allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {
    //Этот подход называется автотесты как документация
    @Test
    @Feature("Портал мультиформат")
    @Story("Возможность загрузки различных форматов пользователями")
    @Owner("Chernikov")
    @Severity(SeverityLevel.NORMAL)
    @Link(value="Заказные Письма ЭЗП", url = "https://zakaznoe.pochta.ru/")
    @DisplayName("Авторизованный пользователь может загружать вложения для письма в формате -> JPG, JSON")
    public void testStaticLabels(){

    }

    // Пример повторения тоже самого лейбла что и наверху в виде кода
    @Test
    public void testDynamicLabels(){
            Allure.getLifecycle().updateTestCase(t -> t.setName("Авторизованный пользователь может загружать вложения для письма в формате -> JPG, JSON"));
            Allure.feature("Портал мультиформат");
            Allure.story("Возможность загрузки различных форматов пользователями");
            Allure.label("owner", "Cherniov");
            Allure.label("severity", SeverityLevel.CRITICAL.value());
            Allure.link("Заказные Письма ЭЗП","https://zakaznoe.pochta.ru/");


        // так же такой вид аннотаций подходит для более опытных автоматизаторов можно в буквальном смысле писать код
        // как пример:
        if(true){
            Allure.feature("Портал мультиформат");
        } else {
            Allure.label("owner", "Cherniov");
        }
    }
}
