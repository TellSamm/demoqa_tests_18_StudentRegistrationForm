package tests;

import org.junit.jupiter.api.*;

public class JUnitExamples {


    @BeforeAll // выполнять действия в начале всех тестов 1 раз
    static void configDB(){
        System.out.println("BeforeAll Configuretion DB!");
    }

    @BeforeEach // выполнять действие перед каждым тестом
    void beforeEach(){
        System.out.println("Here is beforeEach()");
    }

    @AfterAll // выполнить после всех тестов
    static void AfterAll(){
        System.out.println("Here is AfterAll");
    }

    @AfterEach // выполнить по окончанию каждого из тестов
    void AfterEach(){
        System.out.println("Here is AfterEach");
    }


    @Test
    void firsTest(){
        System.out.println("Here is firsTest()");
    }

    @Test
    void secondTest(){
        System.out.println("Here is secondTest()");
    }

}
