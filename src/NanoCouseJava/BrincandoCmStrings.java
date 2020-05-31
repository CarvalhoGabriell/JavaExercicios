package NanoCouseJava;

public class BrincandoCmStrings {

    public static void main(String[] args) {

        String cursos = "Java,Ruby,Python,CSharp,Jscript,PHP,NodeJS,Rust,Clojair";
        String[] linguagens = cursos.split(",");

        for (String cursosSeparados : linguagens) {
            System.out.println(cursosSeparados);
        }


    }
}
