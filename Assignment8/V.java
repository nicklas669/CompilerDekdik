// (v) Has a try/catch block that contains a throw statement (with an exception of your choice).
import java.io.IOException;

public class V {
	public V() {
		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
