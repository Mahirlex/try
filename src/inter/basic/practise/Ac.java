package inter.basic.practise;

public class Ac implements Ab {

	@Override
	public void put() {
		// TODO Auto-generated method stub
		System.out.println("this put"+(q+w));
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("this get"+w);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("this show and multiply"+(q*w));
	}

}
