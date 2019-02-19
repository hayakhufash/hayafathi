package hayah;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;


public class shoping {

	 private List<product> pro=new ArrayList();
int prizeproduct;		
	public  int getcount() {
		// TODO Auto-generated method stub
		return pro.size();	}
	public  void addproduct(product obj) {
		pro.add(obj);
	
		// TODO Auto-generated method stub
		
	}

	public int gettotalprize() {
		if(pro.size() > 0) {
			for ( product  obj : pro )  {
   prizeproduct+=obj.getprize();

			}
			//return prizeproduct;

		}
		return prizeproduct;

		// TODO Auto-generated method stub
		//return prizeproduct;
	}
}
