package rand;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.Random;

@WebService(endpointInterface="rand.RandService")
public class RandImpl implements RandService {
	private static final int maxRands=16;

	//@WebMethod
	@Override
	public int next1(){
		return new Random().nextInt();
	}

	//@WebMethod
	@Override
	public int[] nextN(final int n){
		final int k=(n>maxRands) ? maxRands : Math.abs(n);
		int[] rands=new int[k];
		Random r=new Random();
		for(int i=0; i<k; i++){
			rands[i]=r.nextInt();
			
		}
		return rands;
	}
}