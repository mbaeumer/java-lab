package se.mbaeumer.javalab.java13;

public class TextBlockDemo {


    public static void main(String[] args){

        String TEXT_BLOCK_JSON = """
        {
            "name" : "Baeldung",
                "website" : "https://www.%s.com/"
        }
        """;
        System.out.println(TEXT_BLOCK_JSON);




    }
}
