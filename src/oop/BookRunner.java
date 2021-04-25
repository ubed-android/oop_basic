package oop;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerPrograming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerPrograming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);

    }
}
