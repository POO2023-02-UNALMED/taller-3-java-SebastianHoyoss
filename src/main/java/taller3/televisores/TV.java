package taller3.televisores;

public class TV {
	private Marca marca;
	int canal=1;
	private int precio=500;
	boolean estado;
	int volumen=1;
	private Control control;
	public static int numTV;
	TV tv;
	
	public TV(Marca marc,boolean estado) {
		this.marca=marc;
		this.estado=estado;
		numTV ++;
	}
		public Marca setMarca(Marca s) {
			return this.marca=s;
	}
		public Marca getMarca() {
			return marca;
		}
		public void setCanal(int canal) {
			if (estado==true & canal>=1 & canal<=120) {
			this.canal=canal;
			}
			}
		public int getCanal() {
			return canal;
		}
		public int setPrecio(int precio) {
			return this.precio=precio;
	}
		public int getPrecio() {
			return precio;
		}
		public void setVolumen(int volumen) {
			if (estado==true & volumen>=0 & volumen<=7) {
			this.volumen=volumen;}
	}
		public int getVolumen() {
			return volumen;
		}
		public Control setControl(Control control) {
			return this.control=control;
	}
		public Control getControl() {
			return control;
		}
	public boolean getEstado() {
		return estado;
	}
	public boolean turnOn() {
		return this.estado=true;
	}
	public boolean turnOff() {
		return this.estado=false;
	}
	public void canalUp() {
		if( canal<120 & estado==true) {
			canal++;
		}
	}
	public void canalDown() {
		if( canal>1 & estado==true) {
		canal--;}
	}
	public void volumenUp() {
		if(estado=true & volumen<7){
		volumen++;}
	}
	public void volumenDown() {
		if(estado=true & volumen>0) {
		volumen--;}
	}
	public Object getTv() {
		return tv;
	}
	public static int getNumTV() {
		return numTV;
	}
	public static int setNumTV(int numtv) {
		return numTV=numtv;
	}
}
