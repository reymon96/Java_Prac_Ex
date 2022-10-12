public class Cuenta {

	private String _strNombreCuenta;

	//Inicializador de clase
	public Cuenta(String strNombre){
		this._strNombreCuenta = strNombre;
	}

	public void EstablecerNombre(String strNombre){
		this._strNombreCuenta = strNombre;
	}

	public String ObtenerNombre(){
		return _strNombreCuenta;
	}

}