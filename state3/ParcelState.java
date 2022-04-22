package patterns.state3;

public interface ParcelState {
	public void next(Parcel ctx);
	public void prev(Parcel ctx); 
	public void print(Parcel ctx); 
}
