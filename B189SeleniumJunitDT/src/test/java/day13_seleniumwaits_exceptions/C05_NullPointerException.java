package day13_seleniumwaits_exceptions;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C05_NullPointerException {

    Faker faker;

    /*
    NullPointerException
    Eger bir obje yada variable olusturup bu olusturdugumuz obje yada variable a assignment yapadan kullanmak istersek
    henuz olusturulmamıs degeri null olan obje uzerinde islem yapmaya kalktıgımızda bu hatayı alırız
     */


    @Test
    public void test01() {

    //    faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

    }
}
