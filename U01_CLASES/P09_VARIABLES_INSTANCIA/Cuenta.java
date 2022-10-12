public class Cuenta {

	private String _strNombreCuenta = "Usuario";

	public void EstablecerNombre(String strNombre){
		this._strNombreCuenta = strNombre;
	}

	public String ObtenerNombre(){
		return _strNombreCuenta;
	}

}