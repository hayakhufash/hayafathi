package testpk;

//import junit.framework.TestCase;
import org.junit.Test;

import hayah.product;
import hayah.shoping;

//الimport junit.framework.Assert;
import static org.junit.Assert.*;


import static org.junit.Assert.*;



public class shopingchart_test {
@Test  //Testcase1
 public void test1() {
	shoping ha=new shoping();
	assertTrue(ha.getcount()==0);
}



@Test  //Testcase2
public void test2() {
	shoping ha=new shoping();
	product obj=new product("java",1,127);
    ha.addproduct(obj);
    assertTrue(ha.getcount()==1);
    assertTrue(ha.gettotalprize()==127);
}



@Test //Testcase3
public void test3() {
	shoping ha=new shoping();
	//int x=2;

product h1=new product("java",16,127);
product h2=new product("web design",6,100);
	ha.addproduct(h1);
	ha.addproduct(h2);
	 assertTrue(ha.getcount()==2);
	 assertTrue(ha.gettotalprize()==227);
	
	
	
}

}
