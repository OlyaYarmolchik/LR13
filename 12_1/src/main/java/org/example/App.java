package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double salary = 100.0;
        System.out.println(salary);
        salary = Tester.doubleSalary(salary);
        System.out.println(salary);
        Tester tester=new Tester(salary);

    }
}
