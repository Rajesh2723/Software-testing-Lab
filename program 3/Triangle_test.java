package rajpro3;


import static org.junit.Assert.*;

import org.junit.Test;

public class Triangle_test {
Trianglejunit t=new Trianglejunit();
@Test
public void test1(){
assertEquals(t.check(100,100,2),"Isosceles");
}
@Test
public void test2(){
assertEquals(t.check(100,100,100),"Equilateral");
}
@Test
public void test3(){
assertEquals(t.check(10,20,25),"Scalene");
}
@Test
public void test4(){
assertEquals(t.check(1,100,200),"Not a triangle");
}

/*
public void test5(){
assertEquals(t.check(1,100,300),"Invalid Input");
}
*/

}
