package Pages.Darksky;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.*;

public class LandingPage extends BasePage {

     By hoursLocator = By.xpath("//span[@class='hour']");


     public boolean verifyTimelineFormat(int interval) {
          List<WebElement> allHours = findElementsUsingFluentWait(hoursLocator);
          List<String> visibleHours = new ArrayList<>();
          for(WebElement hour: allHours) {
               String numberOfHour=hour.getText().replaceAll("\\D+","");
               if(numberOfHour.length()!=0) {
                    visibleHours.add(numberOfHour);
               }
          }
          List<String> timeNumber = new ArrayList<>();
          SimpleDateFormat hours = new SimpleDateFormat("h");
          Calendar currentTime = Calendar.getInstance();
          for(int i=0; i<visibleHours.size(); i++) {
               currentTime.add(Calendar.HOUR_OF_DAY,interval);
               timeNumber.add(hours.format(currentTime.getTime()));
          }
          System.out.println(timeNumber);
          System.out.println(visibleHours);
          boolean isNotEqual=true;
          for(int i=0; i<visibleHours.size(); i++) {
               if(!visibleHours.get(i).equals(timeNumber.get(i))) {
                   isNotEqual=false;
                   break;
               }
          }
          return isNotEqual;
     }
}

