package tests;

import baseClasses.BaseTest;
import pages.AboutUsPage;
import pages.HomePage;

public class TestSQADays extends BaseTest {

    public TestSQADays(){
        //setting up page to test
        super.setup();
        AboutUsPage page = new HomePage(this.driver).goToHP().goToAUP();

        //checking for element to be present
        try {
            page.getElementFromList(page.getAllElementsByParam(page.pageBody, page.listOfURLs), "href", "http://sqadays.com/");
            System.out.println("SQA days url is present on page");
        }
        catch (Exception e){
            System.out.println("There is no such url");
        }
        super.teardown();

    }
    public static void main(String[] args){
        new TestSQADays();
    }
}
