import static org.junit.Assert.*;

import org.junit.Test;

public class triTC {

@Test
public void test() {
tri t1=new tri();
assertEquals(t1.op(2, 2, 5),"Not a Triangle");
}
@Test
public void test12() {
tri t1=new tri();
assertEquals(t1.op(1, 8, 1),"Not a Triangle");
}
@Test
public void test13() {
tri t1=new tri();
assertEquals(t1.op(2, 3, 7),"Not a Triangle");
}

@Test
public void test1() {
tri t1=new tri();
assertEquals(t1.op(3, 3, 3),"Equilateral Triangle");
}

@Test
public void test2() {
tri t1=new tri();
assertEquals(t1.op(4, 5, 3),"Scalene Triangle");
}
@Test
public void test3() {
tri t1=new tri();
assertEquals(t1.op(6, 8, 6),"Isosceles Triangle");
}
@Test
public void test4() {
tri t1=new tri();
assertEquals(t1.op(0, 1, 5),"Invalid");
}
@Test
public void test51() {
tri t1=new tri();
assertEquals(t1.op(3, 3, 4),"Isosceles Triangle");
}
@Test
public void test52() {
tri t1=new tri();
assertEquals(t1.op(9, 9, 5),"Isosceles Triangle");
}
@Test
public void test5() {
tri t1=new tri();
assertEquals(t1.op(1, 2, 2),"Isosceles Triangle");
}

@Test
public void test7() {
tri t1=new tri();
assertEquals(t1.op(4, 7, 201),"Invalid");
}


}

