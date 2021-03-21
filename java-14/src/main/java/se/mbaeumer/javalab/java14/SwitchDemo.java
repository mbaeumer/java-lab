package se.mbaeumer.javalab.java14;

public class SwitchDemo {

    public void demo(){
        final String day = "SATURDAY";

        boolean isHoliday = switch(day){
            case "SATURDAY","SUNDAY" -> true;
            default -> false;
        };

        System.out.println(isHoliday);
    }


}
